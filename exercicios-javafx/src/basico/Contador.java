package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	private int contador = 0;
	
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if(contador > 0) {
			label.getStyleClass().add("verde");
		}else if (contador < 0) {
			label.getStyleClass().add("vermelho");
		}
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		// Label na tela
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");

		
		//Botao de decremento e ação dele
		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botoes");
		botaoDecremento.setOnAction(e -> {
			contador--;
			atualizarLabelNumero(labelNumero);
		});
		
		//Botao de incremento e ação dele
		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botoes");
		botaoIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
		});
		//Caixa na horizontal com os botoes
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		//Caixa na vertical com tudo
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setSpacing(10);
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		//Adicionar o css no Java
		String caminhoDoCss = getClass()
				.getResource("/basico/Contador.css").toExternalForm();
		//Tela
		Scene cenaPrincipal = new Scene(boxConteudo, 400 , 400);
		cenaPrincipal.getStylesheets().add(caminhoDoCss);//css
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
