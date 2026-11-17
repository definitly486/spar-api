package bl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Logger f16755iobyxmoadg = Logger.getLogger("okio.Okio");

    public static final wwaezpbzkn dxjokdxxww(Socket socket) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(socket, "<this>");
        lmojexxdyd lmojexxdydVar = new lmojexxdyd(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(inputStream, "getInputStream()");
        return lmojexxdydVar.pmvmpeiblj(new rgvfuqvkyq(inputStream, lmojexxdydVar));
    }

    public static final iozdgvuglv eablkybsjg(Socket socket) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(socket, "<this>");
        lmojexxdyd lmojexxdydVar = new lmojexxdyd(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(outputStream, "getOutputStream()");
        return lmojexxdydVar.lereixgezr(new cqumvgiudr(outputStream, lmojexxdydVar));
    }

    public static /* synthetic */ iozdgvuglv gxszxtbevo(File file, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        return zdlpuopuiu.eablkybsjg(file, z13);
    }

    public static final wwaezpbzkn lqeggnwhkg(File file) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "<this>");
        return new rgvfuqvkyq(new FileInputStream(file), ylkuphrtab.f16756eablkybsjg);
    }

    public static final wwaezpbzkn nufgyqmvbu(InputStream inputStream) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inputStream, "<this>");
        return new rgvfuqvkyq(inputStream, new ylkuphrtab());
    }

    public static final iozdgvuglv ppxfxbqfkf(File file, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "<this>");
        return zdlpuopuiu.gxszxtbevo(new FileOutputStream(file, z13));
    }

    public static final iozdgvuglv wkgbmnqykc(OutputStream outputStream) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outputStream, "<this>");
        return new cqumvgiudr(outputStream, new ylkuphrtab());
    }

    public static final boolean zoijcleaow(AssertionError assertionError) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? mj.kcexrzcfyt.sopmlzcsov(message, "getsockname failed", false, 2, null) : false;
    }
}
