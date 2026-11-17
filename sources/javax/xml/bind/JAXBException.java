package javax.xml.bind;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public class JAXBException extends Exception {
    static final long serialVersionUID = -5621384651494307979L;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private volatile Throwable f50947zdlpuopuiu;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f50947zdlpuopuiu;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.f50947zdlpuopuiu == null) {
            return super.toString();
        }
        return super.toString() + "\n - with linked exception:\n[" + this.f50947zdlpuopuiu.toString() + "]";
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
    }
}
