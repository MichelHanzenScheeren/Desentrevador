import tkinter as tk
import utils
import os


# ********** STYLE ********** #
BACKGROUND = '#282a36'
FOREGROUND = '#ffffff'
ACTIVE_BACKGROUND = '#3e4451'
BAR_BACKGROUND = '#21222c'
BAR_FOREGROUND = '#9da5b4'
EXTERNAL_PADDING = 10
INTERNAL_PADDING = 15


# ********** WINDOW CONFIGURATION ********** #
window = tk.Tk()
window.geometry(f'{window.winfo_screenwidth()}x{window.winfo_screenheight()}')
window.title('Galpão dos código')
window.grid_columnconfigure(0, weight=8)
window.grid_columnconfigure(1, weight=2)
window.grid_rowconfigure(0, weight=8)
window.grid_rowconfigure(1, weight=2)
window.config(background=BAR_BACKGROUND)
main_frame = tk.Frame(window, background=BAR_BACKGROUND).grid(sticky='nsew')

# ********** MENU CONFIGURATION ********** #
menu_bar = tk.Menu(window, background='#191a21', foreground=FOREGROUND, borderwidth=0)
file_menu = tk.Menu(menu_bar,  tearoff=0)
file_menu.add_command(label='Open', command=lambda:utils.open_file(code_text, linenumber_text))
file_menu.add_command(label='Save', command=lambda:utils.save(code_text))
file_menu.add_command(label='Save As', command=lambda:utils.save_as(code_text))
file_menu.add_command(label='Exit', command=exit)
run_menu = tk.Menu(menu_bar,  tearoff=0)
run_menu.add_command(label='Run', command=lambda:utils.run(console_text, tree_text))
menu_bar.add_cascade(label='File', menu=file_menu)
menu_bar.add_cascade(label='Run', menu=run_menu)
window.config(menu=menu_bar)

# ********** LEFT CODE AREA CONFIGURATION ********** #
left_frame = tk.Frame(main_frame, background=BAR_BACKGROUND)
left_frame.grid(sticky="nsew", row=0, column=0, padx=(EXTERNAL_PADDING, EXTERNAL_PADDING // 2), pady=(EXTERNAL_PADDING, EXTERNAL_PADDING // 2))
left_frame.grid_columnconfigure(0, weight=1)
left_frame.grid_rowconfigure(1, weight=1)
linenumber_text = tk.Text(left_frame, bg='#191a21', foreground='grey', width=5, highlightthickness=0, borderwidth=0, pady=INTERNAL_PADDING, font='18')
scrollbar = tk.Scrollbar(
        left_frame, bg='#505050', troughcolor=BACKGROUND, highlightcolor="gray",
        activebackground="gray", highlightbackground=BAR_BACKGROUND,
        highlightthickness=0, borderwidth=0)
code_text = tk.Text(
        left_frame, background=BACKGROUND, foreground=FOREGROUND, selectbackground=ACTIVE_BACKGROUND,
        selectforeground=FOREGROUND, tabs=16,  highlightthickness=0, borderwidth=0, pady=INTERNAL_PADDING, padx=INTERNAL_PADDING,
        insertbackground=FOREGROUND, font='18')
linenumber_text.insert(1.0, '1')
linenumber_text.tag_configure("center", justify='center')
linenumber_text.tag_add("center", "1.0", "end")
linenumber_text.configure(state='disabled')
linenumber_text.pack(side="left", fill="y")
scrollbar.config(command=lambda x, y: utils.scroll_control(x, y, code_text, linenumber_text))
scrollbar.pack(side='right', fill='y')
code_text.configure(yscrollcommand=lambda x, y: utils.text_scroll_control(x, y, scrollbar, linenumber_text))
code_text.tag_configure("types", foreground="#bf91ff")
code_text.tag_configure("reserved", foreground="#ffa500")
code_text.bind('<BackSpace>', lambda key: utils.linenumber_control(key, code_text, linenumber_text))
code_text.bind('<Return>', lambda key: utils.linenumber_control(key, code_text, linenumber_text))
code_text.bind('<Any-KeyPress>', lambda _: utils.apply_highlight(code_text))
code_text.pack(side='top', fill='both', expand=True)
code_text.focus_set()

# ********** BOTTOM OUTPUT AREA CONFIGURATION ********** #
bottom_frame = tk.Frame(main_frame, background=BAR_BACKGROUND)
bottom_frame.grid(row=1, column=0, sticky='nsew', padx=(EXTERNAL_PADDING, EXTERNAL_PADDING), pady=(EXTERNAL_PADDING // 2, EXTERNAL_PADDING), columnspan=2)
bottom_frame.grid_columnconfigure(0, weight=1)
bottom_frame.grid_rowconfigure(1, weight=1)
console_text = tk.Text(bottom_frame, background=BACKGROUND, foreground=FOREGROUND,  pady=INTERNAL_PADDING, padx=INTERNAL_PADDING, height=5, highlightthickness=0, borderwidth=0)
console_text.insert(1.0, 'Desentrevador\nAguardando processo de compilação...')
console_text.configure(state='disabled')
console_text.pack(fill='both', expand=True)

# ********** RIGTH TREE AREA CONFIGURATION ********** #
rigth_frame = tk.Frame(main_frame, background=BAR_BACKGROUND)
rigth_frame.grid(row=0, column=1, sticky='nsew', padx=(EXTERNAL_PADDING // 2, EXTERNAL_PADDING), pady=(EXTERNAL_PADDING, EXTERNAL_PADDING // 2))
rigth_frame.grid_columnconfigure(0, weight=1)
rigth_frame.grid_rowconfigure(1, weight=1)
tree_text = tk.Text(rigth_frame, background=BACKGROUND, foreground=FOREGROUND,  pady=INTERNAL_PADDING, padx=INTERNAL_PADDING, width=6, highlightthickness=0, borderwidth=0)
tree_text.insert(1.0, 'Agurdando árvore sintática...')
tree_text.configure(state='disabled')
tree_text.pack(fill='both', expand=True)

# ********** IMAGE AREA CONFIGURATION ********** #
image_frame = tk.Frame(main_frame, background=BACKGROUND)
image_frame.grid(row=1, column=1, sticky='nsew', padx=INTERNAL_PADDING, pady=INTERNAL_PADDING)
img = tk.PhotoImage(file=f'{os.path.dirname(os.path.abspath(__file__))}/cuia.png')
label = tk.Label(image_frame, background=BACKGROUND, image=img)
label.pack(expand=True, fill='both')

# RUN FIXED WINDOW
window.mainloop()
