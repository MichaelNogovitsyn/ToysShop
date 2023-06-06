import java.io.Serializable;
    public class IdGenerator implements Serializable {
        private int id;

        public IdGenerator() {
            this.id = 0;
        }

        public int getId() {
            return id++;
        }

        public int idLast() {
            return this.id;
        }
    }
