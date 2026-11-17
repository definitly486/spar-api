package t7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class zynmafqrjb implements cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zynmafqrjb f110005iobyxmoadg = new zynmafqrjb();

    private zynmafqrjb() {
    }

    @Override // t7.cllcsxoeiz
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public PointF iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, float f13) {
        u7.ppxfxbqfkf.zoijcleaow zoijcleaowVarZdlpuopuiu = ppxfxbqfkfVar.zdlpuopuiu();
        if (zoijcleaowVarZdlpuopuiu != u7.ppxfxbqfkf.zoijcleaow.BEGIN_ARRAY && zoijcleaowVarZdlpuopuiu != u7.ppxfxbqfkf.zoijcleaow.BEGIN_OBJECT) {
            if (zoijcleaowVarZdlpuopuiu == u7.ppxfxbqfkf.zoijcleaow.NUMBER) {
                PointF pointF = new PointF(((float) ppxfxbqfkfVar.agtfadlqog()) * f13, ((float) ppxfxbqfkfVar.agtfadlqog()) * f13);
                while (ppxfxbqfkfVar.btonecajqb()) {
                    ppxfxbqfkfVar.pmvmpeiblj();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + zoijcleaowVarZdlpuopuiu);
        }
        return kcexrzcfyt.eablkybsjg(ppxfxbqfkfVar, f13);
    }
}
