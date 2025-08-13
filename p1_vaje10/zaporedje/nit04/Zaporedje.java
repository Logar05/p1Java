
public abstract class Zaporedje {

    public abstract Integer y(int x);

    public String vNiz(Interval interval) {
        StringBuilder sb = new StringBuilder("[");
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        boolean prvic = true;
        for (int x = zacetek;  x <= konec;  x++) {
            Integer y = this.y(x);
            if (y != null) {
                if (!prvic) {
                    sb.append(", ");
                }
                prvic = false;
                sb.append(String.format("%d -> %d", x, y));
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Interval minMax(Interval interval) {
        boolean frst = true;
        int start = interval.vrniZacetek();
        int end = interval.vrniKonec();
        int min = 0;
        int max = 0;
        for(int i = start; i <= end; i++) {
            if(y(i) != null) {
                min = y(i);
                max = y(i);
                break;
            }
        }
        for(int i = start; i <= end; i++) {
            if(frst && y(i) != null) {
                frst = false;
                min = y(i);
                max = y(i);
            }
            if((y(i) != null) && y(i) > max) {
                max = y(i);
            }
            if((y(i) != null) && y(i) < min) {
                min = y(i);
            }
        }
        return new Interval(min, max);
    }

    public boolean jeMonotono(Interval interval) {
        int start = interval.vrniZacetek();
        int end = interval.vrniKonec();
        boolean narasca = true;
        boolean pada = true;
        int first = 0;
        int next = 0;
        int ixFrst = 0;
        for(int i = start; i <= end; i++) {
            if(y(i) != null) {
                first = y(i);
                ixFrst = i;
                break;
            }
        }
        for(int i = ixFrst + 1; i <= end; i++) {
            if(y(i) == null) continue;
            next = y(i);
            if(next >= first) pada = false;
            if(next <= first) narasca = false;
            first = next;
        }
        return narasca || pada;
    }

    public Zaporedje vsota(Zaporedje drugo) {
        return new Vsota(this, drugo);
    }

    public Zaporedje inverz(Interval interval) {
        if(this.jeMonotono(interval) == false) return null;
        return new Inverz(this, interval);
    }
}
