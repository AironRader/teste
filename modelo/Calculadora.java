package modelo;
/**
 *
 * @author Juan
 */
import java.util.ArrayList;
import java.util.List;
public class Calculadora {
        private Float valor1;
        private Float valor2;
	private Float resultado;
	private List<String> resultados = new ArrayList<String>();

	public Float getValor1() {
		return valor1;
	}

	public void setValor1(Float valor1) {
		this.valor1 = valor1;
	}

	public Float getValor2() {
		return valor2;
	}

	public void setValor2(Float valor2) {
		this.valor2 = valor2;
	}

	public Float getResultado() {
		return resultado;
	}

	public void setResultado(Float resultado) {
		this.resultado = resultado;
	}

	public List<String> getResultados() {
		return resultados;
	}

	public void setResultados(List<String> resultados) {
		this.resultados = resultados;
	}
	
	public void somar(){
		resultado=valor1+valor2;
		resultados.add("["+valor1+"+"+valor2+"="+resultado+"]");
	}
        public void subtrair(){
            resultado = valor1 - valor2;
            resultados.add("["+valor1+"-"+valor2+"="+resultado+"]");
        }
        public void multiplicar(){
            resultado =  valor1 * valor2;
            resultados.add("["+valor1+"*"+valor2+"="+resultado+"]");
        }
        public void dividir(){
            resultado = valor1 / valor2;
            resultados.add("["+valor1+"/"+valor2+"="+resultado+"]");
        }
        

}

