package jl;

/* JADX INFO: loaded from: classes3.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public int f51681iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public Object f51682zoijcleaow;

    public wkgbmnqykc(int i13, Object obj) {
        this.f51681iobyxmoadg = i13;
        this.f51682zoijcleaow = obj;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        switch (this.f51681iobyxmoadg) {
            case -1:
                sb3.append("END OF FILE");
                break;
            case 0:
                sb3.append("VALUE(");
                sb3.append(this.f51682zoijcleaow);
                sb3.append(")");
                break;
            case 1:
                sb3.append("LEFT BRACE({)");
                break;
            case 2:
                sb3.append("RIGHT BRACE(})");
                break;
            case 3:
                sb3.append("LEFT SQUARE([)");
                break;
            case 4:
                sb3.append("RIGHT SQUARE(])");
                break;
            case 5:
                sb3.append("COMMA(,)");
                break;
            case 6:
                sb3.append("COLON(:)");
                break;
        }
        return sb3.toString();
    }
}
