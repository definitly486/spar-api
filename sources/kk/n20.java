package kk;

import android.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import spay.seamlessAuth.core.data.network.dto.ExchangeTokenResponseDto;

/* JADX INFO: loaded from: classes3.dex */
public final class n20 implements lk.gxszxtbevo {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f57717jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.hcddaimhww f57718yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ lg.draadjrbmk f57719zdlpuopuiu;

    public n20(lg.draadjrbmk draadjrbmkVar, kotlin.jvm.internal.hcddaimhww hcddaimhwwVar, kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar) {
        this.f57719zdlpuopuiu = draadjrbmkVar;
        this.f57718yggfygwlhe = hcddaimhwwVar;
        this.f57717jyumaefscl = hkdspvbjdzVar;
    }

    @Override // lk.gxszxtbevo
    public final void gxszxtbevo(lk.eablkybsjg call, IOException e13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(call, "call");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(e13, "e");
        lg.draadjrbmk draadjrbmkVar = this.f57719zdlpuopuiu;
        String message = e13.getMessage();
        if (message == null) {
            message = "Error message was empty";
        }
        draadjrbmkVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(new ff(message)));
    }

    @Override // lk.gxszxtbevo
    public final void ppxfxbqfkf(lk.eablkybsjg call, lk.cdpycssgdh response) {
        bl.eablkybsjg eablkybsjgVarDraadjrbmk;
        Charset UTF_8;
        Object objWkgbmnqykc;
        lk.yadqdtsiqt yadqdtsiqtVarWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(call, "call");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(response, "response");
        zy.zoijcleaow(response);
        this.f57717jyumaefscl.f60015zdlpuopuiu = response;
        this.f57718yggfygwlhe.f60014zdlpuopuiu = response.btonecajqb();
        h10 h10Var = new h10(this.f57718yggfygwlhe, response);
        jc2.iobyxmoadg.f51100iobyxmoadg.zoijcleaow("EVENT!!!_IS_SUCCESS --- " + response.iwxlajgraz(), new Object[0]);
        if (!response.iwxlajgraz()) {
            lg.draadjrbmk draadjrbmkVar = this.f57719zdlpuopuiu;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            draadjrbmkVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(h10Var.invoke()));
            return;
        }
        lk.yggfygwlhe yggfygwlheVarKcexrzcfyt = response.kcexrzcfyt();
        lk.yadqdtsiqt yadqdtsiqtVarWkgbmnqykc2 = response.wkgbmnqykc();
        if (yadqdtsiqtVarWkgbmnqykc2 == null || (eablkybsjgVarDraadjrbmk = yadqdtsiqtVarWkgbmnqykc2.draadjrbmk()) == null) {
            return;
        }
        eablkybsjgVarDraadjrbmk.lrnfpwlwnk(Long.MAX_VALUE);
        bl.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = eablkybsjgVarDraadjrbmk.zoijcleaow();
        if (mj.kcexrzcfyt.istkbnxepw("gzip", yggfygwlheVarKcexrzcfyt.iobyxmoadg("Content-Encoding"), true)) {
            bl.agtfadlqog agtfadlqogVar = new bl.agtfadlqog(ppxfxbqfkfVarZoijcleaow);
            try {
                ppxfxbqfkfVarZoijcleaow = new bl.ppxfxbqfkf();
                ppxfxbqfkfVarZoijcleaow.xrmfcynszj(agtfadlqogVar);
                rg.zoijcleaow.iobyxmoadg(agtfadlqogVar, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    rg.zoijcleaow.iobyxmoadg(agtfadlqogVar, th2);
                    throw th3;
                }
            }
        }
        lk.cqumvgiudr cqumvgiudrVarDxjokdxxww = yadqdtsiqtVarWkgbmnqykc2.dxjokdxxww();
        if (cqumvgiudrVarDxjokdxxww == null || (UTF_8 = cqumvgiudrVarDxjokdxxww.iobyxmoadg(StandardCharsets.UTF_8)) == null) {
            UTF_8 = StandardCharsets.UTF_8;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(UTF_8, "UTF_8");
        }
        String strF = ppxfxbqfkfVarZoijcleaow.F(UTF_8);
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(eo.f56445iobyxmoadg.gtknphoqwx(strF, ExchangeTokenResponseDto.class));
        } catch (Throwable th4) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th4));
        }
        Object obj = gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc;
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) || obj == null) {
            Log.w("PARSER", "Gson couldn't deserialize " + ExchangeTokenResponseDto.class + " - " + strF + " \nCause: " + gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc));
        }
        if (obj == null) {
            this.f57719zdlpuopuiu.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(h10Var.invoke()));
            return;
        }
        lk.cdpycssgdh cdpycssgdhVar = (lk.cdpycssgdh) this.f57717jyumaefscl.f60015zdlpuopuiu;
        if (cdpycssgdhVar != null && (yadqdtsiqtVarWkgbmnqykc = cdpycssgdhVar.wkgbmnqykc()) != null) {
            yadqdtsiqtVarWkgbmnqykc.close();
        }
        this.f57719zdlpuopuiu.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(new zynmafqrjb(obj)));
    }
}
