package Data;

public class Book3 {
    private int id; // pk
	private String title; // notnull
	private String author1;
	private String author2;
	private String author3;
	private String publisher;
	private double isbn13; // notnull
	private String date;
	private int pages;
	private String ProductDimensions;
	private int SalesRank;
	private int RatingsCount;
	private Double RatingValue;
	private String PaperbackPrice;
	private String HardcoverPrice;
	private String EbookPrice;
	private String AudiobookPrice;
	public int elementCount = 17;


	public Book3() {
		
	}
	
	public Book3 (int id, String title, String author1, 
			String author2, String author3, String publisher, 
			double isbn13, String date, int pages, String ProductDimensions, 
			int SalesRank, int RatingsCount, Double RatingValue, 
			String PaperbackPrice, String HardcoverPrice, String EbookPrice,
			String AudiobookPrice) {
		this.id = id;
		this.title = title;
		this.author1 = author1;
		this.author2 = author2;
		this.author3 = author3;
		this.publisher = publisher;
		this.isbn13 = isbn13;
		this.date = date;
		this.pages = pages;
		this.ProductDimensions = ProductDimensions;
		this.SalesRank = SalesRank;
		this.RatingsCount = RatingsCount;
		this.RatingValue = RatingValue;
		this.PaperbackPrice = PaperbackPrice;
		this.HardcoverPrice = HardcoverPrice;
		this.EbookPrice = EbookPrice;
		this.AudiobookPrice = AudiobookPrice;
	}

	public int GetID() {
		return id;
	}

	public void SetID(int id) {
		this.id = id;
	}

	public String GetTitle() {
		return title;
	}

	public void SetTitle(String title) {
		this.title = title;
	}

	
	public String GetAuthor1() {
		return author1;
	}

	public void SetAuthor1(String author1) {
		this.author1 = author1;
	}

	public String GetAuthor2() {
		return author2;
	}

	public void SetAuthor2(String author2) {
		this.author2 = author2;
	}

	public String GetAuthor3() {
		return author3;
	}

	public void SetAuthor3(String author3) {
		this.author3 = author3;
	}

	public String GetPublisher() {
		return publisher;
	}

	public void SetPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double GetISBN13() {
		return isbn13;
	}

	public void SetISBN13(double isbn13) {
		this.isbn13 = isbn13;
	}

	public String GetDate() {
		return date;
	}

	public void SetDate(String date) {
		this.date = date;
	}

	public int GetPages() {
		return pages;
	}

	public void SetPages(int pages) {
		this.pages = pages;
	}

	public String GetProductDimensions() {
		return ProductDimensions;
	}

	public void SetProductDimensions(String ProductDimensions) {
		this.ProductDimensions = ProductDimensions;
	}

	public int GetSalesRank() {
		return SalesRank;
	}

	public void SetSalesRank(int SalesRank) {
		this.SalesRank = SalesRank;
	}

	public int GetRatingsCount() {
		return RatingsCount;
	}

	public void SetRatingsCount(int RatingsCount) {
		this.RatingsCount = RatingsCount;
	}

	public Double GetRatingValue() {
		return RatingValue;
	}

	public void SetRatingValue(Double RatingValue) {
		this.RatingValue = RatingValue;
	}

	public String GetPaperbackPrice() {
		return PaperbackPrice;
	}

	public void SetPaperbackPrice(String PaperbackPrice) {
		this.PaperbackPrice = PaperbackPrice;
	}

	public String GetHardcoverPrice() {
		return HardcoverPrice;
	}

	public void SetHardcoverPrice(String HardcoverPrice) {
		this.HardcoverPrice = HardcoverPrice;
	}

	public String GetEbookPrice() {
		return EbookPrice;
	}

	public void SetEbookPrice(String EbookPrice) {
		this.EbookPrice = EbookPrice;
	}

	public String GetAudiobookPrice() {
		return AudiobookPrice;
	}

	public void SetAudiobookPrice(String AudiobookPrice) {
		this.AudiobookPrice = AudiobookPrice;
	}

	public int GetElementCount() {
		return elementCount;
	}

	public int containNull() {
		int count = 0;
		count += (id == -1) ? 1 : 0;
		count += (title.equals("NULL")) ? 1 : 0;
		count += (author1.equals("NULL")) ? 1 : 0;
		count += (author2.equals("NULL")) ? 1 : 0;
		count += (author3.equals("NULL")) ? 1 : 0;
		count += (publisher.equals("NULL")) ? 1 : 0;
		count += (date.equals("NULL")) ? 1 : 0;
		count += (ProductDimensions.equals("NULL")) ? 1 : 0;
		count += (PaperbackPrice.equals("NULL")) ? 1 : 0;
		count += (HardcoverPrice.equals("NULL")) ? 1 : 0;
		count += (EbookPrice.equals("NULL")) ? 1 : 0;
		count += (AudiobookPrice.equals("NULL")) ? 1 : 0;
		count += (RatingsCount == -1) ? 1 : 0;
		count += (RatingValue == -1) ? 1 : 0;
		count += (SalesRank == -1) ? 1 : 0;
		count += (pages == -1) ? 1 : 0;
		count += (isbn13 == -1) ? 1 : 0;
		return count;
	}
}
