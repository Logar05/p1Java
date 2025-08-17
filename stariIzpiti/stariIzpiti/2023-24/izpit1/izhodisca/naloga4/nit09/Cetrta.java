
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02--03: prva skupina
04--05: druga skupina
06--07: tretja skupina
08--11: "cetrta skupina

POZOR: uporabljate lahko samo primitivne tipe, tipni parameter T in tip
Iterator<T>.
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static <T extends Comparable<T>> Iterator<T> zlitje(Iterator<T> a, Iterator<T> b) {
        // popravite / dopolnite ...
        return new itZlitje<T>(a, b);
    }

    public static class itZlitje<T extends Comparable<T>> implements Iterator<T>{
        private Iterator<T> a;
        private Iterator<T> b;
        private T backLogPrvi = null;
        private T backLogDrugi = null;
        public itZlitje(Iterator<T> a, Iterator<T> b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public boolean hasNext() {
            return this.a.hasNext() || this.b.hasNext() || this.backLogDrugi != null || this.backLogPrvi != null;
        }
        @Override
        public T next() {
            if(this.hasNext() == false) throw new NoSuchElementException();
            if(a.hasNext() && b.hasNext()){
            T prvi = (this.backLogPrvi == null) ? a.next() : this.backLogPrvi;
            T drugi = (this.backLogDrugi == null) ? b.next() : this.backLogDrugi;
            
            if(prvi.compareTo(drugi) == 0) {
                this.backLogDrugi = drugi;
                this.backLogPrvi = null;
                return prvi;
            }
            if(prvi.compareTo(drugi) < 0) {
                this.backLogDrugi = drugi;
                this.backLogPrvi = null;
                return prvi;
            }
            else {
                this.backLogPrvi = prvi;
                this.backLogDrugi = null;
                return drugi;
            }
        }
        if(a.hasNext() == false && b.hasNext() == false) {
            T prvi = this.backLogPrvi;
            T drugi = this.backLogDrugi;
            if(prvi == null && drugi == null) throw new NoSuchElementException();
            if(prvi == null) {
                this.backLogDrugi = null;
                return drugi;
            }
            if(drugi == null) {
                this.backLogPrvi = null;
                return prvi;
            }
            if(prvi.compareTo(drugi) == 0) {
                this.backLogDrugi = drugi;
                this.backLogPrvi = null;
                return prvi;
            }
            if(prvi.compareTo(drugi) < 0) {
                this.backLogDrugi = drugi;
                this.backLogPrvi = null;
                return prvi;
            }
            else {
                this.backLogPrvi = prvi;
                this.backLogDrugi = null;
                return drugi;
            }
        }
        if(a.hasNext() == false) {
            T prvi = this.backLogPrvi;
            T drugi = (this.backLogDrugi == null) ? b.next() : this.backLogDrugi;
            if(prvi == null) {
                this.backLogDrugi = null;
                return drugi;
            }
            if(prvi.compareTo(drugi) == 0) {
                this.backLogDrugi = drugi;
                this.backLogPrvi = null;
                return prvi;
            }
            if(prvi.compareTo(drugi) < 0) {
                this.backLogDrugi = drugi;
                this.backLogPrvi = null;
                return prvi;
            }
            else {
                this.backLogPrvi = prvi;
                this.backLogDrugi = null;
                return drugi;
            }
        }
        if(b.hasNext() == false) {
            T prvi = (this.backLogPrvi == null) ? a.next() : this.backLogPrvi;
            T drugi = this.backLogDrugi;
            if(drugi == null) {
                this.backLogPrvi = null;
                return prvi;
            }
            if(prvi.compareTo(drugi) == 0) {
                this.backLogDrugi = drugi;
                this.backLogPrvi = null;
                return prvi;
            }
            if(prvi.compareTo(drugi) < 0) {
                this.backLogDrugi = drugi;
                this.backLogPrvi = null;
                return prvi;
            }
            else {
                this.backLogPrvi = prvi;
                this.backLogDrugi = null;
                return drugi;
            }
        }
        throw new NoSuchElementException();
    }
}
    // pomo"zne metode (po potrebi) ...
}
