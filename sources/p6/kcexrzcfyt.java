package p6;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kcexrzcfyt implements oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final n5.oxmwwwfdhm f75764iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final n5.lereixgezr f75765ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final n5.lereixgezr f75766wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n5.btonecajqb f75767zoijcleaow;

    class iobyxmoadg extends n5.btonecajqb {
        iobyxmoadg(n5.oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, vdvldrhtss vdvldrhtssVar) {
            gtknphoqwxVar.e(1, vdvldrhtssVar.zoijcleaow());
            gtknphoqwxVar.y(2, androidx.work.zoijcleaow.nufgyqmvbu(vdvldrhtssVar.iobyxmoadg()));
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    class ppxfxbqfkf extends n5.lereixgezr {
        ppxfxbqfkf(n5.oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        @Override // n5.lereixgezr
        public String eablkybsjg() {
            return "DELETE FROM WorkProgress";
        }
    }

    class zoijcleaow extends n5.lereixgezr {
        zoijcleaow(n5.oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        @Override // n5.lereixgezr
        public String eablkybsjg() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public kcexrzcfyt(n5.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f75764iobyxmoadg = oxmwwwfdhmVar;
        this.f75767zoijcleaow = new iobyxmoadg(oxmwwwfdhmVar);
        this.f75765ppxfxbqfkf = new zoijcleaow(oxmwwwfdhmVar);
        this.f75766wkgbmnqykc = new ppxfxbqfkf(oxmwwwfdhmVar);
    }

    public static List wkgbmnqykc() {
        return Collections.emptyList();
    }

    @Override // p6.oxmwwwfdhm
    public void iobyxmoadg(String str) {
        this.f75764iobyxmoadg.agtfadlqog();
        u5.gtknphoqwx gtknphoqwxVarZoijcleaow = this.f75765ppxfxbqfkf.zoijcleaow();
        gtknphoqwxVarZoijcleaow.e(1, str);
        try {
            this.f75764iobyxmoadg.ojitshcjhn();
            try {
                gtknphoqwxVarZoijcleaow.pkzmftpjix();
                this.f75764iobyxmoadg.dsvhmnatus();
                this.f75764iobyxmoadg.kcexrzcfyt();
                this.f75765ppxfxbqfkf.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            } catch (Throwable th2) {
                this.f75764iobyxmoadg.kcexrzcfyt();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f75765ppxfxbqfkf.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            throw th3;
        }
    }

    @Override // p6.oxmwwwfdhm
    public void ppxfxbqfkf() {
        this.f75764iobyxmoadg.agtfadlqog();
        u5.gtknphoqwx gtknphoqwxVarZoijcleaow = this.f75766wkgbmnqykc.zoijcleaow();
        try {
            this.f75764iobyxmoadg.ojitshcjhn();
            try {
                gtknphoqwxVarZoijcleaow.pkzmftpjix();
                this.f75764iobyxmoadg.dsvhmnatus();
                this.f75764iobyxmoadg.kcexrzcfyt();
                this.f75766wkgbmnqykc.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            } catch (Throwable th2) {
                this.f75764iobyxmoadg.kcexrzcfyt();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f75766wkgbmnqykc.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            throw th3;
        }
    }

    @Override // p6.oxmwwwfdhm
    public void zoijcleaow(vdvldrhtss vdvldrhtssVar) {
        this.f75764iobyxmoadg.agtfadlqog();
        this.f75764iobyxmoadg.ojitshcjhn();
        try {
            this.f75767zoijcleaow.gtknphoqwx(vdvldrhtssVar);
            this.f75764iobyxmoadg.dsvhmnatus();
        } finally {
            this.f75764iobyxmoadg.kcexrzcfyt();
        }
    }
}
