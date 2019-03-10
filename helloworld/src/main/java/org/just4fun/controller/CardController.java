package org.just4fun.controller;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;

import org.just4fun.model.Card1;




public class CardController {
	private Card1 card1;
	private UIPanel resultPanel;
	private int result;

	public CardController() {
	}

	public String checkResult() {
		FacesContext context = FacesContext.getCurrentInstance();
		resultPanel.setRendered(true);

		if (checkOperation()) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", null));
		} else {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Incorrect", null));
		}
		return null;
	}

	private boolean checkOperation() {
		return (card1.getLeft() * card1.getRight() == result);
	}

	public UIPanel getResultPanel() {
		return resultPanel;
	}

	public void setResultPanel(UIPanel resultPanel) {
		this.resultPanel = resultPanel;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String next() {
		FacesContext context = FacesContext.getCurrentInstance();
		if (checkOperation()) {
			resultPanel.setRendered(false);
			card1 = new Card1();
			return null;
		} else {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Incorrect", null));
		}
		return null;

	}

	public Card1 getCard1() {
		return card1;
	}

	public void setCard1(Card1 card1) {
		this.card1 = card1;
	}

}
