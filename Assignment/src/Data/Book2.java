package Data;

public class Book2 {
    private int id; // pk
	private String book_title; // notnull
	private String authors;
    private int publication_year;
    private int publication_month;
    private int publication_day;
    private String edition;
	private String publisher_name;
	private double isbn13; // notnull
	private String language;
    private String series;
    private int pages;
	private int elementCount = 12;

    public Book2() {
        
    }
    
	public Book2 (int id, String book_title, String authors, 
            int publication_year, int publication_month, int publication_day,
            String edition, String publisher_name, 
            double isbn13, String language,
             String series, int pages) {
        this.id = id;
        this.book_title = book_title;
        this.authors = authors;
        this.publication_year = publication_year;
        this.publication_month = publication_month;
        this.publication_day = publication_day;
        this.edition = edition;
        this.publisher_name = publisher_name;
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

	public String Getbook_title() {
		return book_title;
	}

	public void Setbook_title(String book_title) {
		this.book_title = book_title;
	}

	public String GetAuthors() {
        return authors;
    }

    public void SetAuthors(String authors) {
        this.authors = authors;
    }

    public int GetPubYear() {
        return publication_year;
    }

    public void SetPubYear(int publication_year) {
        this.publication_year = publication_year;
    }

    public int GetPubMonth() {
        return publication_month;
    }

    public void SetPubMonth(int publication_month) {
        this.publication_month = publication_month;
    }

    public int GetPubDay() {
        return publication_day;
    }

    public void SetPubDay(int publication_day) {
        this.publication_day = publication_day;
    }

    public String GetEdition() {
        return edition;
    }

    public void SetEdition(String edition) {
        this.edition = edition;
    }

    public String GetPublisher() {
        return publisher_name;
    }

    public void SetPublisher(String publisher_name) {
        this.publisher_name = publisher_name;
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
		count += (book_title == "NULL") ? 1 : 0;
		count += (authors == "NULL") ? 1 : 0;
        count += (publication_year == -1) ? 1 : 0;
        count += (publication_month == -1) ? 1 : 0;
        count += (publication_day == -1) ? 1 : 0;
        count += (edition == "NULL") ? 1 : 0;
		count += (publisher_name == "NULL") ? 1 : 0;
        count += (isbn13 == -1) ? 1 : 0;
		count += (language == "NULL") ? 1 : 0;
        count += (series == "NULL") ? 1 : 0;
		count += (pages == -1) ? 1 : 0;
		return count;
	}
}

