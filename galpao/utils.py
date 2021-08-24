import tkinter as tk
from tkinter.filedialog import asksaveasfilename, askopenfilename
import subprocess
from pathlib import Path
import os


file_path = ''
TYPES = ['redondo', 'quebrado', 'trova', 'logico', 'vazio']
RESERVED = ['pareHome', 'tche', 'bah', ' dai ', 'funcao', 'devolta', 'loqueando', 'repeteco', ' de ', ' ate ', 'se', 'senao', 'Trovar', 'Escuitar']

def set_file_path(path):
    global file_path
    file_path = Path(path)


def run(console_text, tree_text):
    if file_path == '':
        open_result = askopenfilename(filetypes=[('Gauchol files', '.entrevero')])
        if isinstance(open_result, tuple): return
        set_file_path(Path(open_result))
    lexer_path = os.path.dirname(os.path.abspath(__file__))
    run_desentrevador(console_text, f'java -cp {lexer_path}/../bin parser/Lexer pv {file_path}', True)
    run_desentrevador(tree_text, f'java -cp {lexer_path}/../bin parser/Lexer pt {file_path}', True)


def run_desentrevador(text, command, showrror):
    process = subprocess.Popen(
        command, stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        shell=True)
    output, error = process.communicate()
    text.configure(state='normal')
    text.delete(1.0, tk.END)
    text.insert(1.0, output.decode("utf-8"))
    if showrror:
        text.insert(1.0, error.decode("utf-8"))
    text.configure(state='disabled')


def open_file(code_text, linenumber_text):
    open_result = askopenfilename(filetypes=[('Gauchol files', '.entrevero')])
    if isinstance(open_result, tuple): return
    path = Path(open_result)
    with open(path, 'r') as file:
        code = file.read()
        code_text.delete(1.0, tk.END)
        code_text.insert(1.0, code)
        set_file_path(path)
    apply_highlight(code_text)
    linenumber_control(None, code_text, linenumber_text)


def save_as(code_editor):
    open_result = asksaveasfilename(filetypes=[('Gauchol files', '.entrevero')])
    if isinstance(open_result, tuple): return
    path = Path(open_result)
    with open(path, 'w') as file:
        code = code_editor.get(1.0, tk.END)
        file.write(code)
        set_file_path(path)


def save(code_editor):
    if file_path == '':
        save_as(code_editor)
    else:
        with open(file_path, 'w') as file:
            code = code_editor.get(1.0, tk.END)
            file.write(code)
            set_file_path(Path(file_path))


def apply_highlight(code_text):
    code_text.tag_remove('types', '1.0', 'end')
    code_text.tag_remove('reserved', '1.0', 'end')
    for pattern in TYPES:
        highlight_pattern(pattern, 'types', code_text)
    for reserved in RESERVED:
        highlight_pattern(reserved, 'reserved', code_text)


def highlight_pattern(pattern, tag, code_text, start="1.0", end="end", regexp=False):
        start, end = code_text.index(start), code_text.index(end)
        code_text.mark_set("matchStart", start)
        code_text.mark_set("matchEnd", start)
        code_text.mark_set("searchLimit", end)
        count = tk.IntVar()
        while True:
            index = code_text.search(pattern, "matchEnd","searchLimit", count=count, regexp=regexp)
            if index == "": break
            code_text.mark_set("matchStart", index)
            code_text.mark_set("matchEnd", "%s+%sc" % (index, count.get()))
            code_text.tag_add(tag, "matchStart", "matchEnd")


def linenumber_control(key, code_text, linenumber_text):
    text_lines = ''
    rows_number = int(float(code_text.index('end-1c')))
    linenumber_text.configure(state='normal')
    linenumber_text.delete(1.0, tk.END)
    if key is None or key.keysym == 'Return':
        rows_number += 1
    for index in range(rows_number):
        text_lines += f'{index + 1}\n'
    linenumber_text.insert(1.0, text_lines)
    linenumber_text.configure(state='disabled')
    linenumber_text.tag_add("center", "1.0", "end")
    apply_highlight(code_text)


def scroll_control(x, y, code_text, linenumber_text):
    code_text.yview(x, y)
    linenumber_text.yview(x, y)


def text_scroll_control(x, y, scrollbar, linenumber_text):
    scrollbar.set(x, y)
    linenumber_text.yview('moveto', y)
    linenumber_text.yview('moveto', x)
