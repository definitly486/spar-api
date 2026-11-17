package f4;

import com.google.common.primitives.gxszxtbevo;
import v2.jyumaefscl;
import v2.yggfygwlhe;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow implements jyumaefscl.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f32777iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f32778zoijcleaow;

    public zoijcleaow(String str, String str2) {
        this.f32777iobyxmoadg = xa.zoijcleaow.gxszxtbevo(str);
        this.f32778zoijcleaow = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f32777iobyxmoadg.equals(zoijcleaowVar.f32777iobyxmoadg) && this.f32778zoijcleaow.equals(zoijcleaowVar.f32778zoijcleaow);
    }

    public int hashCode() {
        return ((527 + this.f32777iobyxmoadg.hashCode()) * 31) + this.f32778zoijcleaow.hashCode();
    }

    public String toString() {
        return "VC: " + this.f32777iobyxmoadg + "=" + this.f32778zoijcleaow;
    }

    @Override // v2.jyumaefscl.iobyxmoadg
    public void zoijcleaow(yggfygwlhe.zoijcleaow zoijcleaowVar) {
        String str = this.f32777iobyxmoadg;
        str.hashCode();
        switch (str) {
            case "TOTALTRACKS":
                Integer numWflxmlrfwp = gxszxtbevo.wflxmlrfwp(this.f32778zoijcleaow);
                if (numWflxmlrfwp != null) {
                    zoijcleaowVar.iyctptxqzt(numWflxmlrfwp);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numWflxmlrfwp2 = gxszxtbevo.wflxmlrfwp(this.f32778zoijcleaow);
                if (numWflxmlrfwp2 != null) {
                    zoijcleaowVar.opjhrmiecq(numWflxmlrfwp2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numWflxmlrfwp3 = gxszxtbevo.wflxmlrfwp(this.f32778zoijcleaow);
                if (numWflxmlrfwp3 != null) {
                    zoijcleaowVar.weqkydbzbr(numWflxmlrfwp3);
                    break;
                }
                break;
            case "ALBUM":
                zoijcleaowVar.wypolnanlu(this.f32778zoijcleaow);
                break;
            case "GENRE":
                zoijcleaowVar.ikoacuggdj(this.f32778zoijcleaow);
                break;
            case "TITLE":
                zoijcleaowVar.bfopjjpdmp(this.f32778zoijcleaow);
                break;
            case "DESCRIPTION":
                zoijcleaowVar.sopmlzcsov(this.f32778zoijcleaow);
                break;
            case "DISCNUMBER":
                Integer numWflxmlrfwp4 = gxszxtbevo.wflxmlrfwp(this.f32778zoijcleaow);
                if (numWflxmlrfwp4 != null) {
                    zoijcleaowVar.crxdokpmqz(numWflxmlrfwp4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                zoijcleaowVar.dsvhmnatus(this.f32778zoijcleaow);
                break;
            case "ARTIST":
                zoijcleaowVar.stevsuqkhv(this.f32778zoijcleaow);
                break;
        }
    }
}
