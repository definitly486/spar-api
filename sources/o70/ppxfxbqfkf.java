package o70;

import com.pandulapeter.beagle.common.configuration.Text;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf implements p002if.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f72243iobyxmoadg;

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f72244zoijcleaow = new iobyxmoadg();

        private iobyxmoadg() {
            super(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Все"), null);
        }
    }

    /* JADX INFO: renamed from: o70.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1560ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final C1560ppxfxbqfkf f72245zoijcleaow = new C1560ppxfxbqfkf();

        private C1560ppxfxbqfkf() {
            super(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Сетевые запросы"), null);
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final zoijcleaow f72246zoijcleaow = new zoijcleaow();

        private zoijcleaow() {
            super(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Логи"), null);
        }
    }

    public /* synthetic */ ppxfxbqfkf(Text text, gtknphoqwx gtknphoqwxVar) {
        this(text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.myspar.domain.feature.debugpanel.model.LogClearContract");
        return zdlpuopuiu.eablkybsjg(getId(), ((ppxfxbqfkf) obj).getId());
    }

    @Override // p002if.zoijcleaow
    public String getId() {
        return if.zoijcleaow.iobyxmoadg.iobyxmoadg(this);
    }

    @Override // p002if.zoijcleaow
    public Text getTitle() {
        return this.f72243iobyxmoadg;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    private ppxfxbqfkf(Text text) {
        this.f72243iobyxmoadg = text;
    }
}
