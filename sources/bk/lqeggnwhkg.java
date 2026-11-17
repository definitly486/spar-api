package bk;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {
    public static final iobyxmoadg iobyxmoadg(fk.zoijcleaow zoijcleaowVar, ek.ppxfxbqfkf decoder, String str) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        zdlpuopuiu.btonecajqb(decoder, "decoder");
        iobyxmoadg iobyxmoadgVarNufgyqmvbu = zoijcleaowVar.nufgyqmvbu(decoder, str);
        if (iobyxmoadgVarNufgyqmvbu != null) {
            return iobyxmoadgVarNufgyqmvbu;
        }
        fk.ppxfxbqfkf.zoijcleaow(str, zoijcleaowVar.btonecajqb());
        throw new KotlinNothingValueException();
    }

    public static final agtfadlqog zoijcleaow(fk.zoijcleaow zoijcleaowVar, ek.gxszxtbevo encoder, Object value) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        zdlpuopuiu.btonecajqb(encoder, "encoder");
        zdlpuopuiu.btonecajqb(value, "value");
        agtfadlqog agtfadlqogVarDxjokdxxww = zoijcleaowVar.dxjokdxxww(encoder, value);
        if (agtfadlqogVarDxjokdxxww != null) {
            return agtfadlqogVarDxjokdxxww;
        }
        fk.ppxfxbqfkf.iobyxmoadg(cllcsxoeiz.zoijcleaow(value.getClass()), zoijcleaowVar.btonecajqb());
        throw new KotlinNothingValueException();
    }
}
