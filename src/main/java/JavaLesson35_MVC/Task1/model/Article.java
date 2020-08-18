package JavaLesson35_MVC.Task1.model;

public class Article {
    Integer id;
    String nameArticle;
    String nameAuthor;
    int countSigns;
    String nameMagazine;
    String shortDescription;

    public Article(){ }

    public Article(Integer id, String nameArticle, String nameAuthor, int countSigns, String nameMagazine, String shortDescription) {
        this.id = id;
        this.nameArticle = nameArticle;
        this.nameAuthor = nameAuthor;
        this.countSigns = countSigns;
        this.nameMagazine = nameMagazine;
        this.shortDescription = shortDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getCountSigns() {
        return countSigns;
    }

    public void setCountSigns(int countSigns) {
        this.countSigns = countSigns;
    }

    public String getNameMagazine() {
        return nameMagazine;
    }

    public void setNameMagazine(String nameMagazine) {
        this.nameMagazine = nameMagazine;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", nameArticle='" + nameArticle + '\'' +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", countSigns=" + countSigns +
                ", nameMagazine='" + nameMagazine + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                '}'+"\n";
    }
}
