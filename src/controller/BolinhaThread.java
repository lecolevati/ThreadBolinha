package controller;

import java.awt.Rectangle;

import javax.swing.JLabel;

public class BolinhaThread extends Thread{

	private JLabel bolinha;
	
	public BolinhaThread(JLabel bolinha){
		this.bolinha = bolinha;
	}
	
	public void run(){
		moveBolinha();
	}
	
	public void moveBolinha(){
		Rectangle posicao = bolinha.getBounds();
		for (int i = 0 ; i < 3 ; i++){
			posicao.y += 10;
			bolinha.setBounds(posicao);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0 ; i < 3 ; i++){
			posicao.x += 10;
			bolinha.setBounds(posicao);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0 ; i < 3 ; i++){
			posicao.y -= 10;
			bolinha.setBounds(posicao);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0 ; i < 3 ; i++){
			posicao.x -= 10;
			bolinha.setBounds(posicao);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
