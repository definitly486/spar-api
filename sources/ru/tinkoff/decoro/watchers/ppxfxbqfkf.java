package ru.tinkoff.decoro.watchers;

import ru.tinkoff.decoro.Mask;
import ru.tinkoff.decoro.MaskImpl;

/* JADX INFO: loaded from: classes6.dex */
public class ppxfxbqfkf extends zoijcleaow {

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private MaskImpl f104868zynmafqrjb;

    public ppxfxbqfkf(MaskImpl maskImpl) {
        btonecajqb(maskImpl);
    }

    public void btonecajqb(MaskImpl maskImpl) {
        this.f104868zynmafqrjb = maskImpl;
        lqeggnwhkg();
    }

    @Override // ru.tinkoff.decoro.iobyxmoadg
    public Mask iobyxmoadg() {
        return new MaskImpl(this.f104868zynmafqrjb);
    }
}
