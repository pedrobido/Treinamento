/**
 * Classe aluno
 * @author pbido
 * @since 12/02/2020
 * @version 0.1
 */

package exec6;

import java.awt.HeadlessException;
//import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
//import java.time.YearMonth;
import java.util.Date;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Aluno {
	String nome;
	int anoNascimento;
	String dataNascimento;
	String curso;
	String cidade;

	public Aluno() {

	}

	public Aluno(String nome, int anoNascimento, String dataNascimento, String curso, String cidade) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.dataNascimento = dataNascimento;
		this.curso = curso;
		this.cidade = cidade;
	}

	public int calcularIdade() {
		return (Year.now().getValue() - anoNascimento);
	}

	public int calcularIdadePrecisa() throws ParseException {
		int idadePrecisa = (Integer.parseInt(getIntDateTime()) - converterDataNascimento());
		int ym = (idadePrecisa % 1000000 / 10000);
		return ym;
	}

	public int converterDataNascimento() throws ParseException {
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
		String dataNasc = (new java.text.SimpleDateFormat("yyyyMMdd").format(date1));
		return Integer.parseInt(dataNasc);
	}

	public String getIntDateTime() {
		String data = (new java.text.SimpleDateFormat("yyyyMMdd")
				.format(new java.util.Date(System.currentTimeMillis())));
		return data;
	}

//	public int calcularDiasDeVida() throws ParseException {
//		return (calcularIdadePrecisa() * 365);
//	}
//
//	public int separarData() {
//
//		Calendar c = Calendar.getInstance();
//		int anoAtual = c.get(Calendar.YEAR);
//		int mesAtual = c.get(Calendar.MONTH) + 1;
//		int diaAtual = c.get(Calendar.DATE);
//
//		int diasAtual = (anoAtual * 365) + (mesAtual * 30) + diaAtual;
//
//		String datas[] = dataNascimento.split("/");
//		int dia = Integer.parseInt(datas[0]);
//		int mes = Integer.parseInt(datas[1]);
//		int ano = Integer.parseInt(datas[2]);
//
//		int diasIdade = (ano * 365) + (mes * 30) + dia;
//		int diasTotal = diasAtual - diasIdade;
//
//		return diasTotal;
//	}

	public int idadeEmDias() {
		String data[] = dataNascimento.split("/");
		int ano = Integer.parseInt(data[2]);
		int mes = Integer.parseInt(data[1]);
		int dia = Integer.parseInt(data[0]);

		Calendar c = Calendar.getInstance();
		int anoAtual = c.get(Calendar.YEAR);
		int mesAtual = c.get(Calendar.MONTH) + 1;
		int diaAtual = c.get(Calendar.DATE);

		// Calcula a idade em dias
		DateTime dataInicial = new DateTime(ano, mes, dia, 0, 0);
		DateTime dataFinal = new DateTime(anoAtual, mesAtual, diaAtual, 0, 0);

		int dias = Days.daysBetween(dataInicial, dataFinal).getDays();

		return dias;
	}

	public void exibirTudo() throws HeadlessException, ParseException {
		JOptionPane.showMessageDialog(null,
				"Nome: " + nome + "\nAno de Nascimento: " + anoNascimento + "\nData de Nascimento: " + dataNascimento
						+ "\nCurso: " + curso + "\nCidade: " + cidade + "\nIdade: " + calcularIdade()
						+ "\nIdade Precisa: " + calcularIdadePrecisa() + "\nIdade Precisa em dias: " + idadeEmDias());
	}

}
