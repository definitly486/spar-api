package o70;

import com.pandulapeter.beagle.common.configuration.Text;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg implements p002if.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f72228iobyxmoadg;

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f72229zoijcleaow = new iobyxmoadg();

        private iobyxmoadg() {
            super("Проверить валидность push-токена через бэк", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1201214531;
        }

        public String toString() {
            return "CheckTokenRelevance";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final ppxfxbqfkf f72230zoijcleaow = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super("Сделать рефрэш push-токена", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 380799802;
        }

        public String toString() {
            return "EmulateTokenExpired";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final wkgbmnqykc f72231zoijcleaow = new wkgbmnqykc();

        private wkgbmnqykc() {
            super("Сбросить интревал м/у проверками", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -384632535;
        }

        public String toString() {
            return "ResetCheckingInterval";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final zoijcleaow f72232zoijcleaow = new zoijcleaow();

        private zoijcleaow() {
            super("Скопировать push-токен", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1371930916;
        }

        public String toString() {
            return "CopyTokenToClipboard";
        }
    }

    public /* synthetic */ eablkybsjg(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    @Override // p002if.zoijcleaow
    public String getId() {
        return if.zoijcleaow.iobyxmoadg.iobyxmoadg(this);
    }

    @Override // p002if.zoijcleaow
    public Text getTitle() {
        return this.f72228iobyxmoadg;
    }

    private eablkybsjg(String str) {
        this.f72228iobyxmoadg = com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(str);
    }
}
