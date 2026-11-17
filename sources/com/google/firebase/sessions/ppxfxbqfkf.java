package com.google.firebase.sessions;

import com.google.firebase.draadjrbmk;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ud.esjtqupxsv;
import ud.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final zoijcleaow f24891gxszxtbevo = new zoijcleaow(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private esjtqupxsv f24892eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ylkuphrtab f24893iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f24894ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f24895wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.iobyxmoadg f24896zoijcleaow;

    /* synthetic */ class iobyxmoadg extends vdvldrhtss implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f24897zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ppxfxbqfkf iobyxmoadg() {
            Object objBtonecajqb = draadjrbmk.iobyxmoadg(com.google.firebase.ppxfxbqfkf.f24690iobyxmoadg).btonecajqb(ppxfxbqfkf.class);
            zdlpuopuiu.dxjokdxxww(objBtonecajqb, "Firebase.app[SessionGenerator::class.java]");
            return (ppxfxbqfkf) objBtonecajqb;
        }

        private zoijcleaow() {
        }
    }

    public ppxfxbqfkf(ylkuphrtab timeProvider, tg.iobyxmoadg uuidGenerator) {
        zdlpuopuiu.btonecajqb(timeProvider, "timeProvider");
        zdlpuopuiu.btonecajqb(uuidGenerator, "uuidGenerator");
        this.f24893iobyxmoadg = timeProvider;
        this.f24896zoijcleaow = uuidGenerator;
        this.f24894ppxfxbqfkf = zoijcleaow();
        this.f24895wkgbmnqykc = -1;
    }

    private final String zoijcleaow() {
        String string = ((UUID) this.f24896zoijcleaow.invoke()).toString();
        zdlpuopuiu.dxjokdxxww(string, "uuidGenerator().toString()");
        String lowerCase = kcexrzcfyt.hcddaimhww(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        zdlpuopuiu.dxjokdxxww(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final esjtqupxsv iobyxmoadg() {
        int i13 = this.f24895wkgbmnqykc + 1;
        this.f24895wkgbmnqykc = i13;
        this.f24892eablkybsjg = new esjtqupxsv(i13 == 0 ? this.f24894ppxfxbqfkf : zoijcleaow(), this.f24894ppxfxbqfkf, this.f24895wkgbmnqykc, this.f24893iobyxmoadg.iobyxmoadg());
        return ppxfxbqfkf();
    }

    public final esjtqupxsv ppxfxbqfkf() {
        esjtqupxsv esjtqupxsvVar = this.f24892eablkybsjg;
        if (esjtqupxsvVar != null) {
            return esjtqupxsvVar;
        }
        zdlpuopuiu.pmvmpeiblj("currentSession");
        return null;
    }

    public /* synthetic */ ppxfxbqfkf(ylkuphrtab ylkuphrtabVar, tg.iobyxmoadg iobyxmoadgVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this(ylkuphrtabVar, (i13 & 2) != 0 ? iobyxmoadg.f24897zdlpuopuiu : iobyxmoadgVar);
    }
}
