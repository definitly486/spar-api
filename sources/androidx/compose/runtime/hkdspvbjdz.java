package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class hkdspvbjdz extends a {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cllcsxoeiz f5672zoijcleaow;

    public hkdspvbjdz(tg.draadjrbmk draadjrbmkVar) {
        super(new tg.iobyxmoadg() { // from class: androidx.compose.runtime.jpowsppfya
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return hkdspvbjdz.nufgyqmvbu();
            }
        });
        this.f5672zoijcleaow = new cllcsxoeiz(draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object nufgyqmvbu() {
        jyumaefscl.yggfygwlhe("Unexpected call to default provider");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.istkbnxepw
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public cllcsxoeiz iobyxmoadg() {
        return this.f5672zoijcleaow;
    }

    @Override // androidx.compose.runtime.a
    public b ppxfxbqfkf(Object obj) {
        return new b(this, obj, obj == null, null, null, null, true);
    }
}
