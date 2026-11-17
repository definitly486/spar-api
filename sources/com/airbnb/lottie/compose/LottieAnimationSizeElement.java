package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import m7.gxszxtbevo;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Lz/ribwqtqdhb;", "Lm7/gxszxtbevo;", "", "width", "height", "<init>", "(II)V", "wflxmlrfwp", "()Lm7/gxszxtbevo;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Lm7/gxszxtbevo;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "zoijcleaow", "I", "getWidth", "ppxfxbqfkf", "getHeight", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LottieAnimationSizeElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final int height;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final int width;

    public LottieAnimationSizeElement(int i13, int i14) {
        this.width = i13;
        this.height = i14;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) other;
        return this.width == lottieAnimationSizeElement.width && this.height == lottieAnimationSizeElement.height;
    }

    public int hashCode() {
        return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(gxszxtbevo node) {
        zdlpuopuiu.btonecajqb(node, "node");
        node.I0(this.width);
        node.H0(this.height);
    }

    public String toString() {
        return "LottieAnimationSizeElement(width=" + this.width + ", height=" + this.height + ")";
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo btonecajqb() {
        return new gxszxtbevo(this.width, this.height);
    }
}
