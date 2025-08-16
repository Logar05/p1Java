
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static class Celica implements Comparable<Celica>{
        private int vrstica;
        private int stolpec;

        public Celica(int vrstica, int stolpec) {
            this.vrstica = vrstica;
            this.stolpec = stolpec;
        }

        public int manhatanska(Celica druga) {
            return (int)(Math.abs(this.stolpec - druga.stolpec) + Math.abs(this.vrstica - druga.vrstica));
        }


        @Override
        public int compareTo(Celica druga) {
            if(this.vrstica - druga.vrstica != 0) return this.vrstica - druga.vrstica;
            return this.stolpec - druga.stolpec;
        }


        @Override
        public String toString() {
            return String.format("(%d, %d)", this.vrstica, this.stolpec);
        }

        // dopolnite po potrebi ...
    }



    public static class Ovojnik implements Iterable<Celica>{
        private boolean[][] tabela;
        public Celica mid;
        public NavigableSet<Celica> trues = new TreeSet<>();
        public ArrayList<Celica> tmp = new ArrayList<>();
        public Ovojnik(boolean[][] tabela) {
            this.tabela = tabela;
            this.mid = new Celica((int)(tabela.length / 2), (int)(tabela.length / 2));
            this.tmp.addAll(this.enice());
            this.trues.addAll(tmp);
        }

        public Comparator<Celica> poManhattanski() {
            return new PoManhattanski();
        }

        @Override
        public Iterator<Celica> iterator() {
            NavigableSet<Celica> set = new TreeSet<>();
            set.addAll(this.enice());
            return set.iterator();
        }

        public boolean[][] vrniTab() {
            return this.tabela;
        }

        /*private class novIt<Celica> implements Iterator<Celica> {
            private int count = 0;
            private int lim = Ovojnik.this.trues.size();
            @Override
            public boolean hasNext() {
                if(count < lim) return true;
                return false;
            }

            @Override
            public Celica next(){

                return null;
            }

        }
*/
        private class PoManhattanski implements Comparator<Celica> {
            @Override
            public int compare(Celica a, Celica b) {
                int man = a.manhatanska(Ovojnik.this.mid) - b.manhatanska(Ovojnik.this.mid);
                if(man != 0) return man;
                return a.compareTo(b); 
            }
        }

        public NavigableSet<Celica> enice() {
            Comparator<Celica> cmp = new PoManhattanski();
            NavigableSet<Celica> set = new TreeSet<>(cmp);
            for(int i = 0; i < this.tabela.length; i++) {
                for(int j = 0; j < this.tabela[i].length; j++) {
                    if(this.tabela[i][j]) {
                        set.add(new Celica(i, j));
                    } 
                }
            }

            return set;
        }



        // dopolnite po potrebi ...
    }
}
