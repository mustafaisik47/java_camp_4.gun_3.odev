package entities;

public class Product {
	private String gameName;
	private int gameId;
	private int gamePrice;

	public Product() {

	}

	public Product(String gameName, int gameId, int gamePrice) {
		super();
		this.gameName = gameName;
		this.gameId = gameId;
		this.gamePrice = gamePrice;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}

}
