package o70;

import com.pandulapeter.beagle.common.configuration.Text;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo implements p002if.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f72233iobyxmoadg;

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final eablkybsjg f72234zoijcleaow = new eablkybsjg();

        private eablkybsjg() {
            super(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(l40.ppxfxbqfkf.TEST.wkgbmnqykc()), null);
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f72235zoijcleaow = new iobyxmoadg();

        private iobyxmoadg() {
            super(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(l40.ppxfxbqfkf.DEV.wkgbmnqykc()), null);
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final ppxfxbqfkf f72236zoijcleaow = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(l40.ppxfxbqfkf.PROD.wkgbmnqykc()), null);
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final wkgbmnqykc f72237zoijcleaow = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(l40.ppxfxbqfkf.TEAMPROFI.wkgbmnqykc()), null);
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final zoijcleaow f72238zoijcleaow = new zoijcleaow();

        private zoijcleaow() {
            super(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(l40.ppxfxbqfkf.PREPROD.wkgbmnqykc()), null);
        }
    }

    public /* synthetic */ gxszxtbevo(Text text, gtknphoqwx gtknphoqwxVar) {
        this(text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.myspar.domain.feature.debugpanel.model.ServerSelectionContract");
        return zdlpuopuiu.eablkybsjg(getId(), ((gxszxtbevo) obj).getId());
    }

    @Override // p002if.zoijcleaow
    public String getId() {
        return if.zoijcleaow.iobyxmoadg.iobyxmoadg(this);
    }

    @Override // p002if.zoijcleaow
    public Text getTitle() {
        return this.f72233iobyxmoadg;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    private gxszxtbevo(Text text) {
        this.f72233iobyxmoadg = text;
    }
}
