package qk;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vdvldrhtss {
    public static final boolean iobyxmoadg(IOException e13) {
        zdlpuopuiu.btonecajqb(e13, "e");
        if ((e13 instanceof ProtocolException) || (e13 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e13 instanceof SSLHandshakeException) && (e13.getCause() instanceof CertificateException)) || (e13 instanceof SSLPeerUnverifiedException) || !(e13 instanceof SSLException)) ? false : true;
    }
}
