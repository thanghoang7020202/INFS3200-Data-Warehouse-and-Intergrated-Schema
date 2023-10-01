package Data;

public class Book1 {
    private int id; // pk
	private String title; // notnull
	private String authors;
    private int pubyear;
    private int pubmonth;
    private int pubday;
    private String edition;
	private String publisher;
	private double isbn13; // notnull
	private String language;
    private String series;
    private int pages;
	private int elementCount = 12;

    public Book1() {
        
    }

	public Book1 (int id, String title, String authors, 
            int pubyear, int pubmonth, int pubday,
            String edition, String publisher, 
            double isbn13, String language,
             String series, int pages) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.pubyear = pubyear;
        this.pubmonth = pubmonth;
        this.pubday = pubday;
        this.edition = edition;
        this.publisher = publisher;
        this.isbn13 = isbn13;
        this.language = language;
        this.series = series;
        this.pages = pages;
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

	public String GetAuthors() {
        return authors;
    }

    public void SetAuthors(String authors) {
        this.authors = authors;
    }

    public int GetPubYear() {
        return pubyear;
    }

    public void SetPubYear(int pubyear) {
        this.pubyear = pubyear;
    }

    public int GetPubMonth() {
        return pubmonth;
    }

    public void SetPubMonth(int pubmonth) {
        this.pubmonth = pubmonth;
    }

    public int GetPubDay() {
        return pubday;
    }

    public void SetPubDay(int pubday) {
        this.pubday = pubday;
    }

    public String GetEdition() {
        return edition;
    }

    public void SetEdition(String edition) {
        this.edition = edition;
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

    public String GetLanguage() {
        return language;
    }

    public void SetLanguage(String language) {
        this.language = language;
    }

    public String GetSeries() {
        return series;
    }

    public void SetSeries(String series) {
        this.series = series;
    }

    public int GetPages() {
        return pages;
    }

    public void SetPages(int pages) {
        this.pages = pages;
    }

    public int GetElementCount() {
        return elementCount;
    }
	public int containNull() {
		int count = 0;
		count += (title == "NULL") ? 1 : 0;
		count += (authors == "NULL") ? 1 : 0;
        count += (pubyear == -1) ? 1 : 0;
        count += (pubmonth == -1) ? 1 : 0;
        count += (pubday == -1) ? 1 : 0;
        count += (edition == "NULL") ? 1 : 0;
		count += (publisher == "NULL") ? 1 : 0;
        count += (isbn13 == -1) ? 1 : 0;
		count += (language == "NULL") ? 1 : 0;
        count += (series == "NULL") ? 1 : 0;
		count += (pages == -1) ? 1 : 0;
		return count;
	}
}
