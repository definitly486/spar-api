package v8;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
final class draadjrbmk extends btonecajqb {
    private draadjrbmk(Drawable drawable) {
        super(drawable);
    }

    static n8.ppxfxbqfkf eablkybsjg(Drawable drawable) {
        if (drawable != null) {
            return new draadjrbmk(drawable);
        }
        return null;
    }

    @Override // n8.ppxfxbqfkf
    public int getSize() {
        return Math.max(1, this.f116312zdlpuopuiu.getIntrinsicWidth() * this.f116312zdlpuopuiu.getIntrinsicHeight() * 4);
    }

    @Override // n8.ppxfxbqfkf
    public Class ppxfxbqfkf() {
        return this.f116312zdlpuopuiu.getClass();
    }

    @Override // n8.ppxfxbqfkf
    public void zoijcleaow() {
    }
}
