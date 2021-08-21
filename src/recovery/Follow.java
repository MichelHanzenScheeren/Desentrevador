package recovery;

import parser.*;

public class Follow {
	static private final RecoverySet firstLinha = new RecoverySet();
	static private final RecoverySet firstBloco = new RecoverySet();
	static private final RecoverySet firstMain = new RecoverySet();
	static public final RecoverySet main = new RecoverySet();
	static public final RecoverySet linha = new RecoverySet();
	static public final RecoverySet elementoDeLinha = new RecoverySet();
	static public final RecoverySet bloco = new RecoverySet();
	static public final RecoverySet atribuicao = elementoDeLinha;
	static public final RecoverySet lacoDeAtribuicao = new RecoverySet();
	static public final RecoverySet expressao = new RecoverySet();
	static public final RecoverySet atribuivel = new RecoverySet();
	static public final RecoverySet operador = new RecoverySet();
	static public final RecoverySet operadorMatematico = new RecoverySet();
	static public final RecoverySet operadorLogico = operador;
	static public final RecoverySet conectorLogico = operador;
	static public final RecoverySet declaracaoDeVariavel = elementoDeLinha;
	static public final RecoverySet tipoDeDado = new RecoverySet();
	static public final RecoverySet listaDeDecaracao = declaracaoDeVariavel;
	static public final RecoverySet chamadaDeFuncao = new RecoverySet();
	static public final RecoverySet passagemDeParametros = new RecoverySet();
	static public final RecoverySet funcoesNativas = elementoDeLinha;
	static public final RecoverySet funcaoTrovar = funcoesNativas;
	static public final RecoverySet funcaoEscuitar = new RecoverySet();
	static public final RecoverySet retornoDeFuncao = elementoDeLinha;
	static public final RecoverySet inicioDoLoqueando = new RecoverySet();
	static public final RecoverySet inicioDoRepeteco = new RecoverySet();
	static public final RecoverySet meioBlocoRepeticao = new RecoverySet();
	static public final RecoverySet fimBlocoRepeticao = new RecoverySet();
	static public final RecoverySet inicioSe = new RecoverySet();
	static public final RecoverySet seDeUmaLinha = new RecoverySet();
	static public final RecoverySet blocoSe = new RecoverySet();
	static public final RecoverySet inicioSenao = new RecoverySet();
	static public final RecoverySet fimBlocoSenao = new RecoverySet();
	static public final RecoverySet definicaoDeFuncao = new RecoverySet();
	static public final RecoverySet tipoDeRetorno = new RecoverySet();
	static public final RecoverySet definicaoParametros = passagemDeParametros;
	static public final RecoverySet meioDeFuncao = new RecoverySet();
	static public final RecoverySet blocoFuncao = new RecoverySet();

    static {
		firstLinha.add(LexerConstants.FIM_LINHA);
		firstLinha.add(LexerConstants.NOME_VARIAVEL);
		firstLinha.add(LexerConstants.REDONDO);
		firstLinha.add(LexerConstants.QUEBRADO);
		firstLinha.add(LexerConstants.TROVA);
		firstLinha.add(LexerConstants.LOGICO);
		firstLinha.add(LexerConstants.NOME_FUNCAO);
		firstLinha.add(LexerConstants.TROVAR);
		firstLinha.add(LexerConstants.ESCUITAR);
		firstLinha.add(LexerConstants.DEVOLTA);

		firstBloco.add(LexerConstants.LOQUEANDO);
		firstBloco.add(LexerConstants.REPETECO);
		firstBloco.add(LexerConstants.SE);
		firstBloco.add(LexerConstants.FUNCAO);

		firstMain.union(firstBloco);
		firstMain.union(firstLinha);
		firstMain.add(LexerConstants.PARE_HOME);
		firstMain.add(LexerConstants.EOF);

		bloco.union(firstMain);
		bloco.add(LexerConstants.BAH);
		bloco.add(LexerConstants.SENAO);

		linha.union(firstMain);
		linha.union(meioBlocoRepeticao);
		linha.add(LexerConstants.BAH);
		linha.add(LexerConstants.SENAO);
		linha.union(bloco);

		main.add(LexerConstants.EOF);

		passagemDeParametros.add(LexerConstants.FECHA_PARENTESE);

		operador.add(LexerConstants.NEGACAO);
		operador.add(LexerConstants.ABRE_PARENTESE);
		operador.add(LexerConstants.MAIS);
		operador.add(LexerConstants.MENOS);
		operador.add(LexerConstants.NUMERO);
		operador.add(LexerConstants.TEXTO);
		operador.add(LexerConstants.BOOLEANO);
		operador.add(LexerConstants.NOME_VARIAVEL);
		operador.add(LexerConstants.NOME_FUNCAO);
		operador.add(LexerConstants.ESCUITAR);

		operadorMatematico.union(operador);
		operadorMatematico.add(LexerConstants.IGUAL);

		elementoDeLinha.add(LexerConstants.FIM_LINHA);
		elementoDeLinha.add(LexerConstants.SENAO);

		lacoDeAtribuicao.union(atribuicao);
		lacoDeAtribuicao.union(listaDeDecaracao);
		lacoDeAtribuicao.union(definicaoParametros);
		lacoDeAtribuicao.add(LexerConstants.VIRGULA);


		expressao.union(lacoDeAtribuicao);
		expressao.union(passagemDeParametros);
		expressao.union(retornoDeFuncao);
		expressao.add(LexerConstants.FECHA_PARENTESE);
		expressao.add(LexerConstants.VIRGULA);
		expressao.add(LexerConstants.ATE);
		expressao.add(LexerConstants.TCHE);
		expressao.add(LexerConstants.DAI);

		atribuivel.add(LexerConstants.MAIS);
		atribuivel.add(LexerConstants.MENOS);
		atribuivel.add(LexerConstants.VEZES);
		atribuivel.add(LexerConstants.DIVIDIDO);
		atribuivel.add(LexerConstants.ELEVADO);
		atribuivel.add(LexerConstants.RESTO);
		atribuivel.add(LexerConstants.MAIOR);
		atribuivel.add(LexerConstants.MENOR);
		atribuivel.add(LexerConstants.MAIOR_IGUAL);
		atribuivel.add(LexerConstants.MENOR_IGUAL);
		atribuivel.add(LexerConstants.IGUAL);
		atribuivel.add(LexerConstants.DIFERENTE);
		atribuivel.add(LexerConstants.E);
		atribuivel.add(LexerConstants.OU);
		atribuivel.union(expressao);

		chamadaDeFuncao.union(elementoDeLinha);
		chamadaDeFuncao.union(atribuivel);

		meioBlocoRepeticao.union(bloco);
		definicaoDeFuncao.union(bloco);
		meioDeFuncao.union(definicaoDeFuncao);
		blocoFuncao.union(meioDeFuncao);
		tipoDeRetorno.add(LexerConstants.NOME_FUNCAO);
		fimBlocoSenao.union(bloco);
		inicioSenao.union(bloco);
		blocoSe.union(bloco);
		seDeUmaLinha.union(bloco);
		inicioSe.union(bloco);
		fimBlocoRepeticao.union(bloco);
		inicioDoRepeteco.union(bloco);
		inicioDoLoqueando.union(bloco);
		funcaoEscuitar.union(elementoDeLinha);
		funcaoEscuitar.union(atribuivel);

		tipoDeDado.add(LexerConstants.NOME_VARIAVEL);
		tipoDeDado.union(tipoDeRetorno);

    }
}
