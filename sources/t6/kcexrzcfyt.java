package t6;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class kcexrzcfyt extends ContextWrapper implements mbcevpiqjq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jztzpxfvev f109835yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ag.ppxfxbqfkf f109836zdlpuopuiu;

    public kcexrzcfyt(Context context) {
        super(context);
        this.f109836zdlpuopuiu = (ag.ppxfxbqfkf) ag.ppxfxbqfkf.zoijcleaow(new fg.iobyxmoadg() { // from class: t6.oxmwwwfdhm
            @Override // fg.iobyxmoadg
            public final Object get() {
                return this.f109859iobyxmoadg.eablkybsjg();
            }
        });
        this.f109835yggfygwlhe = gxszxtbevo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public tbqsvytpvh eablkybsjg() {
        return new tbqsvytpvh(vipkmwdibw.wkgbmnqykc().zoijcleaow(this).iobyxmoadg());
    }

    private jztzpxfvev gxszxtbevo() {
        tbqsvytpvh tbqsvytpvhVar = (tbqsvytpvh) this.f109836zdlpuopuiu.get();
        jztzpxfvev jztzpxfvevVarZoijcleaow = tbqsvytpvhVar.iobyxmoadg().zoijcleaow();
        jztzpxfvevVarZoijcleaow.gxszxtbevo(Collections.singletonMap(roivzttewh.class, tbqsvytpvhVar));
        return jztzpxfvevVarZoijcleaow;
    }

    @Override // t6.mbcevpiqjq
    public Object iobyxmoadg(Class cls) {
        return this.f109835yggfygwlhe.ppxfxbqfkf(cls);
    }

    public Object wkgbmnqykc(Class cls) {
        return this.f109835yggfygwlhe.iobyxmoadg(cls);
    }

    @Override // t6.mbcevpiqjq
    public jhduphickx zoijcleaow(Class cls) {
        return this.f109835yggfygwlhe.zoijcleaow(cls);
    }
}
