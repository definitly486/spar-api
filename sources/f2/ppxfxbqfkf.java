package f2;

import ah.gtknphoqwx;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.cllcsxoeiz;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf implements wg.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Object f32589eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private volatile d2.eablkybsjg f32590gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f32591iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final draadjrbmk f32592ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cllcsxoeiz f32593wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final e2.zoijcleaow f32594zoijcleaow;

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f32595yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Context f32596zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(Context context, ppxfxbqfkf ppxfxbqfkfVar) {
            super(0);
            this.f32596zdlpuopuiu = context;
            this.f32595yggfygwlhe = ppxfxbqfkfVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f32596zdlpuopuiu;
            zdlpuopuiu.dxjokdxxww(applicationContext, "applicationContext");
            return zoijcleaow.iobyxmoadg(applicationContext, this.f32595yggfygwlhe.f32591iobyxmoadg);
        }
    }

    public ppxfxbqfkf(String name, e2.zoijcleaow zoijcleaowVar, draadjrbmk produceMigrations, cllcsxoeiz scope) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(produceMigrations, "produceMigrations");
        zdlpuopuiu.btonecajqb(scope, "scope");
        this.f32591iobyxmoadg = name;
        this.f32594zoijcleaow = zoijcleaowVar;
        this.f32592ppxfxbqfkf = produceMigrations;
        this.f32593wkgbmnqykc = scope;
        this.f32589eablkybsjg = new Object();
    }

    @Override // wg.wkgbmnqykc
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public d2.eablkybsjg iobyxmoadg(Context thisRef, gtknphoqwx property) {
        d2.eablkybsjg eablkybsjgVar;
        zdlpuopuiu.btonecajqb(thisRef, "thisRef");
        zdlpuopuiu.btonecajqb(property, "property");
        d2.eablkybsjg eablkybsjgVar2 = this.f32590gxszxtbevo;
        if (eablkybsjgVar2 != null) {
            return eablkybsjgVar2;
        }
        synchronized (this.f32589eablkybsjg) {
            try {
                if (this.f32590gxszxtbevo == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    g2.ppxfxbqfkf ppxfxbqfkfVar = g2.ppxfxbqfkf.f35840iobyxmoadg;
                    e2.zoijcleaow zoijcleaowVar = this.f32594zoijcleaow;
                    draadjrbmk draadjrbmkVar = this.f32592ppxfxbqfkf;
                    zdlpuopuiu.dxjokdxxww(applicationContext, "applicationContext");
                    this.f32590gxszxtbevo = ppxfxbqfkfVar.iobyxmoadg(zoijcleaowVar, (List) draadjrbmkVar.invoke(applicationContext), this.f32593wkgbmnqykc, new iobyxmoadg(applicationContext, this));
                }
                eablkybsjgVar = this.f32590gxszxtbevo;
                zdlpuopuiu.lqeggnwhkg(eablkybsjgVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eablkybsjgVar;
    }
}
