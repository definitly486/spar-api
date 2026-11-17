package rk;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final gxszxtbevo f82954iobyxmoadg = new gxszxtbevo();

    private gxszxtbevo() {
    }

    public static final boolean iobyxmoadg(String method) {
        zdlpuopuiu.btonecajqb(method, "method");
        return (zdlpuopuiu.eablkybsjg(method, "GET") || zdlpuopuiu.eablkybsjg(method, "HEAD")) ? false : true;
    }

    public static final boolean wkgbmnqykc(String method) {
        zdlpuopuiu.btonecajqb(method, "method");
        return zdlpuopuiu.eablkybsjg(method, "POST") || zdlpuopuiu.eablkybsjg(method, "PUT") || zdlpuopuiu.eablkybsjg(method, "PATCH") || zdlpuopuiu.eablkybsjg(method, "PROPPATCH") || zdlpuopuiu.eablkybsjg(method, "REPORT");
    }

    public final boolean ppxfxbqfkf(String method) {
        zdlpuopuiu.btonecajqb(method, "method");
        return zdlpuopuiu.eablkybsjg(method, "PROPFIND");
    }

    public final boolean zoijcleaow(String method) {
        zdlpuopuiu.btonecajqb(method, "method");
        return !zdlpuopuiu.eablkybsjg(method, "PROPFIND");
    }
}
