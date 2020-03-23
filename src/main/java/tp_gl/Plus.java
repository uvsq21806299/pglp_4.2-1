package tp_gl;

import java.util.Stack;

import Exception.PileVideException;

public class Plus implements SpecifiqueCommande {
	private final MoteurRPN mteur;
	private final Specifique specifique;
	
	public Plus(MoteurRPN moteur, Specifique specifique)
	{
		this.mteur = moteur;
		this.specifique = specifique;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		double val1 = 0,val2=0;
		
		try
		{
			val1 =  mteur.operand.pop();
			val2 = 	mteur.operand.pop();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		mteur.operand.push(specifique.plus(val1, val2));
	}
}
