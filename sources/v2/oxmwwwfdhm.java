package v2;

import java.util.Objects;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class oxmwwwfdhm {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String f115649ppxfxbqfkf = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f115650wkgbmnqykc = stevsuqkhv.uawqvzlxes(1);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f115651iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f115652zoijcleaow;

    public oxmwwwfdhm(String str, String str2) {
        this.f115651iobyxmoadg = stevsuqkhv.ezmngbhpjk(str);
        this.f115652zoijcleaow = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
        return Objects.equals(this.f115651iobyxmoadg, oxmwwwfdhmVar.f115651iobyxmoadg) && Objects.equals(this.f115652zoijcleaow, oxmwwwfdhmVar.f115652zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = this.f115652zoijcleaow.hashCode() * 31;
        String str = this.f115651iobyxmoadg;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
