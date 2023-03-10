package ComprehensiveExample;

import jakarta.persistence.*;

@Entity
public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column(nullable = false, unique = true)
        private String title;

        @Column(nullable = false)
        private String author;

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getAuthor() {
                return author;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public Book(long id, String title, String author) {
                super();
                this.id = id;
                this.title = title;
                this.author = author;
        }

        @Override
        public String toString() {
                return "Book{" +
                        "id=" + id +
                        ", title='" + title + '\'' +
                        ", author='" + author + '\'' +
                        '}';
        }
}

