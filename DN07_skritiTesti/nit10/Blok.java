import java.util.HashSet;
import java.util.*;
public class Blok {
    private Stanovanje stanovanje;
    private Set<Oseba> vsi = new HashSet<>();
    private int[] dims = new int[2];
    public Blok(Stanovanje stanovanje) {
        this.stanovanje = stanovanje;
    }

    public void vseOsebeFill(Stanovanje tmp, Set<Oseba> vsi, Set<Stanovanje> visited) {
        if(tmp == null || visited.contains(tmp)) return;
        visited.add(tmp);
        this.vsi.addAll(Arrays.asList(tmp.vrniStanovalce()));
        Stanovanje[] sos = tmp.vrniSosede();
        for(int i = 0; i < 4; i++) {
            vseOsebeFill(sos[i], vsi, visited);
        }
    }

    public Oseba starosta() {
        Set<Stanovanje> obiskani = new HashSet<>();
        vseOsebeFill(this.stanovanje, this.vsi, obiskani);
        Oseba[] vseOsebe = this.vsi.toArray(new Oseba[0]);
        Stanovanje skupno = new Stanovanje(vseOsebe);
        return skupno.starosta();
    }

    public int rekVert(Stanovanje cur, Set<Stanovanje> visited) {
        if(cur == null || visited.contains(cur)) return 0;
        visited.add(cur);
        int up = 1 + rekVert(cur.vrniSosede()[1], visited);
        int down = 1 + rekVert(cur.vrniSosede()[3], visited);
        int left = rekVert(cur.vrniSosede()[0], visited);
        int right = rekVert(cur.vrniSosede()[2], visited);
        int mid = up + down;
        if(mid >= left && mid >= right) return mid;
        else if(left >= mid && left >= right) return left;
        else return right;
    }

    public int[][] razporeditev() {
        // dopolnite/popravite ...
        Set<Stanovanje> visited = new HashSet<>();
        int vert = rekVert(this.stanovanje, visited);
        System.out.println(vert);
        return null;
    }
}
