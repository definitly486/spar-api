package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f23588iobyxmoadg;

    iobyxmoadg() {
    }

    @Override // com.google.android.play.core.integrity.btonecajqb
    final btonecajqb iobyxmoadg(String str) {
        this.f23588iobyxmoadg = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.btonecajqb
    final ua.wkgbmnqykc zoijcleaow() {
        String str = this.f23588iobyxmoadg;
        if (str != null) {
            return new zoijcleaow(str, null);
        }
        throw new IllegalStateException("Missing required properties: token");
    }
}
