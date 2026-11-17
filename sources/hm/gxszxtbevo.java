package hm;

import cm.vdvldrhtss;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {

    static final class iobyxmoadg extends gxszxtbevo implements Serializable {
        private static final long serialVersionUID = -8733721350312276297L;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final vdvldrhtss f40777zdlpuopuiu;

        iobyxmoadg(vdvldrhtss vdvldrhtssVar) {
            this.f40777zdlpuopuiu = vdvldrhtssVar;
        }

        @Override // hm.gxszxtbevo
        public boolean btonecajqb(cm.gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar) {
            return this.f40777zdlpuopuiu.equals(vdvldrhtssVar);
        }

        @Override // hm.gxszxtbevo
        public boolean dxjokdxxww() {
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof iobyxmoadg) {
                return this.f40777zdlpuopuiu.equals(((iobyxmoadg) obj).f40777zdlpuopuiu);
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zoijcleaowVar.dxjokdxxww() && this.f40777zdlpuopuiu.equals(zoijcleaowVar.iobyxmoadg(cm.wkgbmnqykc.f20164jyumaefscl));
        }

        public int hashCode() {
            return ((this.f40777zdlpuopuiu.hashCode() + 31) ^ (this.f40777zdlpuopuiu.hashCode() + 31)) ^ 1;
        }

        @Override // hm.gxszxtbevo
        public vdvldrhtss iobyxmoadg(cm.wkgbmnqykc wkgbmnqykcVar) {
            return this.f40777zdlpuopuiu;
        }

        @Override // hm.gxszxtbevo
        public List lqeggnwhkg(cm.gxszxtbevo gxszxtbevoVar) {
            return Collections.singletonList(this.f40777zdlpuopuiu);
        }

        @Override // hm.gxszxtbevo
        public boolean nufgyqmvbu(cm.wkgbmnqykc wkgbmnqykcVar) {
            return false;
        }

        public String toString() {
            return "FixedRules:" + this.f40777zdlpuopuiu;
        }

        @Override // hm.gxszxtbevo
        public wkgbmnqykc wkgbmnqykc(cm.gxszxtbevo gxszxtbevoVar) {
            return null;
        }
    }

    gxszxtbevo() {
    }

    public static gxszxtbevo draadjrbmk(vdvldrhtss vdvldrhtssVar) {
        fm.ppxfxbqfkf.dxjokdxxww(vdvldrhtssVar, "offset");
        return new iobyxmoadg(vdvldrhtssVar);
    }

    public abstract boolean btonecajqb(cm.gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar);

    public abstract boolean dxjokdxxww();

    public abstract vdvldrhtss iobyxmoadg(cm.wkgbmnqykc wkgbmnqykcVar);

    public abstract List lqeggnwhkg(cm.gxszxtbevo gxszxtbevoVar);

    public abstract boolean nufgyqmvbu(cm.wkgbmnqykc wkgbmnqykcVar);

    public abstract wkgbmnqykc wkgbmnqykc(cm.gxszxtbevo gxszxtbevoVar);
}
