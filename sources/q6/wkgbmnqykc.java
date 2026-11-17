package q6;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ UUID f77967yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ h6.dsvhmnatus f77968zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(h6.dsvhmnatus dsvhmnatusVar, UUID uuid) {
            super(0);
            this.f77968zdlpuopuiu = dsvhmnatusVar;
            this.f77967yggfygwlhe = uuid;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void btonecajqb(h6.dsvhmnatus dsvhmnatusVar, UUID uuid) {
            String string = uuid.toString();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "id.toString()");
            wkgbmnqykc.wkgbmnqykc(dsvhmnatusVar, string);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            lqeggnwhkg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void lqeggnwhkg() {
            WorkDatabase workDatabaseYggfygwlhe = this.f77968zdlpuopuiu.yggfygwlhe();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(workDatabaseYggfygwlhe, "workManagerImpl.workDatabase");
            final h6.dsvhmnatus dsvhmnatusVar = this.f77968zdlpuopuiu;
            final UUID uuid = this.f77967yggfygwlhe;
            workDatabaseYggfygwlhe.cllcsxoeiz(new Runnable() { // from class: q6.ppxfxbqfkf
                @Override // java.lang.Runnable
                public final void run() {
                    wkgbmnqykc.iobyxmoadg.btonecajqb(dsvhmnatusVar, uuid);
                }
            });
            wkgbmnqykc.gtknphoqwx(this.f77968zdlpuopuiu);
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f77969yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ h6.dsvhmnatus f77970zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(h6.dsvhmnatus dsvhmnatusVar, String str) {
            super(0);
            this.f77970zdlpuopuiu = dsvhmnatusVar;
            this.f77969yggfygwlhe = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void btonecajqb(WorkDatabase workDatabase, String str, h6.dsvhmnatus dsvhmnatusVar) {
            Iterator it = workDatabase.ulzqkzuiru().gtknphoqwx(str).iterator();
            while (it.hasNext()) {
                wkgbmnqykc.wkgbmnqykc(dsvhmnatusVar, (String) it.next());
            }
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            lqeggnwhkg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void lqeggnwhkg() {
            final WorkDatabase workDatabaseYggfygwlhe = this.f77970zdlpuopuiu.yggfygwlhe();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(workDatabaseYggfygwlhe, "workManagerImpl.workDatabase");
            final String str = this.f77969yggfygwlhe;
            final h6.dsvhmnatus dsvhmnatusVar = this.f77970zdlpuopuiu;
            workDatabaseYggfygwlhe.cllcsxoeiz(new Runnable() { // from class: q6.eablkybsjg
                @Override // java.lang.Runnable
                public final void run() {
                    wkgbmnqykc.ppxfxbqfkf.btonecajqb(workDatabaseYggfygwlhe, str, dsvhmnatusVar);
                }
            });
            wkgbmnqykc.gtknphoqwx(this.f77970zdlpuopuiu);
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ h6.dsvhmnatus f77971yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ String f77972zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(String str, h6.dsvhmnatus dsvhmnatusVar) {
            super(0);
            this.f77972zdlpuopuiu = str;
            this.f77971yggfygwlhe = dsvhmnatusVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            wkgbmnqykc.lqeggnwhkg(this.f77972zdlpuopuiu, this.f77971yggfygwlhe);
            wkgbmnqykc.gtknphoqwx(this.f77971yggfygwlhe);
        }
    }

    private static final void btonecajqb(WorkDatabase workDatabase, String str) {
        p6.jyumaefscl jyumaefsclVarUlzqkzuiru = workDatabase.ulzqkzuiru();
        p6.zoijcleaow zoijcleaowVarStevsuqkhv = workDatabase.stevsuqkhv();
        List listKcexrzcfyt = hg.jyumaefscl.kcexrzcfyt(str);
        while (!listKcexrzcfyt.isEmpty()) {
            String str2 = (String) hg.jyumaefscl.hkdspvbjdz(listKcexrzcfyt);
            g6.hkdspvbjdz.ppxfxbqfkf ppxfxbqfkfVarNufgyqmvbu = jyumaefsclVarUlzqkzuiru.nufgyqmvbu(str2);
            if (ppxfxbqfkfVarNufgyqmvbu != g6.hkdspvbjdz.ppxfxbqfkf.SUCCEEDED && ppxfxbqfkfVarNufgyqmvbu != g6.hkdspvbjdz.ppxfxbqfkf.FAILED) {
                jyumaefsclVarUlzqkzuiru.btonecajqb(str2);
            }
            listKcexrzcfyt.addAll(zoijcleaowVarStevsuqkhv.zoijcleaow(str2));
        }
    }

    public static final g6.esjtqupxsv dxjokdxxww(String tag, h6.dsvhmnatus workManagerImpl) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workManagerImpl, "workManagerImpl");
        g6.pkzmftpjix pkzmftpjixVarAgtfadlqog = workManagerImpl.agtfadlqog().agtfadlqog();
        String str = "CancelWorkByTag_" + tag;
        r6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = workManagerImpl.jyumaefscl().ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return g6.istkbnxepw.ppxfxbqfkf(pkzmftpjixVarAgtfadlqog, str, iobyxmoadgVarPpxfxbqfkf, new ppxfxbqfkf(workManagerImpl, tag));
    }

    public static final g6.esjtqupxsv eablkybsjg(UUID id2, h6.dsvhmnatus workManagerImpl) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workManagerImpl, "workManagerImpl");
        g6.pkzmftpjix pkzmftpjixVarAgtfadlqog = workManagerImpl.agtfadlqog().agtfadlqog();
        r6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = workManagerImpl.jyumaefscl().ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return g6.istkbnxepw.ppxfxbqfkf(pkzmftpjixVarAgtfadlqog, "CancelWorkById", iobyxmoadgVarPpxfxbqfkf, new iobyxmoadg(workManagerImpl, id2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(h6.dsvhmnatus dsvhmnatusVar) {
        androidx.work.impl.iobyxmoadg.nufgyqmvbu(dsvhmnatusVar.agtfadlqog(), dsvhmnatusVar.yggfygwlhe(), dsvhmnatusVar.kcexrzcfyt());
    }

    public static final g6.esjtqupxsv gxszxtbevo(String name, h6.dsvhmnatus workManagerImpl) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workManagerImpl, "workManagerImpl");
        g6.pkzmftpjix pkzmftpjixVarAgtfadlqog = workManagerImpl.agtfadlqog().agtfadlqog();
        String str = "CancelWorkByName_" + name;
        r6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = workManagerImpl.jyumaefscl().ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return g6.istkbnxepw.ppxfxbqfkf(pkzmftpjixVarAgtfadlqog, str, iobyxmoadgVarPpxfxbqfkf, new zoijcleaow(name, workManagerImpl));
    }

    public static final void lqeggnwhkg(final String name, final h6.dsvhmnatus workManagerImpl) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workManagerImpl, "workManagerImpl");
        final WorkDatabase workDatabaseYggfygwlhe = workManagerImpl.yggfygwlhe();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(workDatabaseYggfygwlhe, "workManagerImpl.workDatabase");
        workDatabaseYggfygwlhe.cllcsxoeiz(new Runnable() { // from class: q6.zoijcleaow
            @Override // java.lang.Runnable
            public final void run() {
                wkgbmnqykc.nufgyqmvbu(workDatabaseYggfygwlhe, name, workManagerImpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(WorkDatabase workDatabase, String str, h6.dsvhmnatus dsvhmnatusVar) {
        Iterator it = workDatabase.ulzqkzuiru().lqeggnwhkg(str).iterator();
        while (it.hasNext()) {
            wkgbmnqykc(dsvhmnatusVar, (String) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(h6.dsvhmnatus dsvhmnatusVar, String str) {
        WorkDatabase workDatabaseYggfygwlhe = dsvhmnatusVar.yggfygwlhe();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(workDatabaseYggfygwlhe, "workManagerImpl.workDatabase");
        btonecajqb(workDatabaseYggfygwlhe, str);
        h6.zdlpuopuiu zdlpuopuiuVarOxmwwwfdhm = dsvhmnatusVar.oxmwwwfdhm();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarOxmwwwfdhm, "workManagerImpl.processor");
        zdlpuopuiuVarOxmwwwfdhm.zdlpuopuiu(str, 1);
        Iterator it = dsvhmnatusVar.kcexrzcfyt().iterator();
        while (it.hasNext()) {
            ((h6.jyumaefscl) it.next()).iobyxmoadg(str);
        }
    }
}
