package com.ctc.wstx.shaded.msv.org_jp_gr_xml.dom;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class DOMVisitorException extends RuntimeException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Exception f21761zdlpuopuiu;

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(new PrintWriter((OutputStream) System.err, true));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace(new PrintWriter(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        if (printWriter == null) {
            printWriter = new PrintWriter((OutputStream) System.err, true);
        }
        super.printStackTrace(printWriter);
        if (this.f21761zdlpuopuiu != null) {
            printWriter.println();
            printWriter.println("StackTrace of Original Exception:");
            this.f21761zdlpuopuiu.printStackTrace(printWriter);
        }
    }
}
