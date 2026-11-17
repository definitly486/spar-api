package o70;

import com.pandulapeter.beagle.common.configuration.Text;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow implements p002if.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f72261iobyxmoadg;

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f72262zoijcleaow = new iobyxmoadg();

        private iobyxmoadg() {
            super(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(j40.iobyxmoadg.BITRIX_NEW.lqeggnwhkg()), null);
        }
    }

    /* JADX INFO: renamed from: o70.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1562zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final C1562zoijcleaow f72263zoijcleaow = new C1562zoijcleaow();

        private C1562zoijcleaow() {
            super(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(j40.iobyxmoadg.BITRIX_OLD.lqeggnwhkg()), null);
        }
    }

    public /* synthetic */ zoijcleaow(Text text, gtknphoqwx gtknphoqwxVar) {
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
        return this.f72261iobyxmoadg;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    private zoijcleaow(Text text) {
        this.f72261iobyxmoadg = text;
    }
}
