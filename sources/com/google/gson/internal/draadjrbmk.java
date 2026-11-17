package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class draadjrbmk {
    public static com.google.gson.nufgyqmvbu iobyxmoadg(ce.iobyxmoadg iobyxmoadgVar) {
        boolean z13;
        try {
            try {
                iobyxmoadgVar.kegysxyocb();
                z13 = false;
                try {
                    return (com.google.gson.nufgyqmvbu) TypeAdapters.f25072ulzqkzuiru.zoijcleaow(iobyxmoadgVar);
                } catch (EOFException e13) {
                    e = e13;
                    if (z13) {
                        return com.google.gson.dxjokdxxww.f24950zdlpuopuiu;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (EOFException e14) {
                e = e14;
                z13 = true;
            }
        } catch (MalformedJsonException e15) {
            throw new JsonSyntaxException(e15);
        } catch (IOException e16) {
            throw new JsonIOException(e16);
        } catch (NumberFormatException e17) {
            throw new JsonSyntaxException(e17);
        }
    }

    public static Writer ppxfxbqfkf(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new zoijcleaow(appendable);
    }

    public static void zoijcleaow(com.google.gson.nufgyqmvbu nufgyqmvbuVar, ce.ppxfxbqfkf ppxfxbqfkfVar) {
        TypeAdapters.f25072ulzqkzuiru.wkgbmnqykc(ppxfxbqfkfVar, nufgyqmvbuVar);
    }

    private static final class zoijcleaow extends Writer {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final iobyxmoadg f25109yggfygwlhe = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Appendable f25110zdlpuopuiu;

        private static class iobyxmoadg implements CharSequence {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private String f25111yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private char[] f25112zdlpuopuiu;

            private iobyxmoadg() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i13) {
                return this.f25112zdlpuopuiu[i13];
            }

            void iobyxmoadg(char[] cArr) {
                this.f25112zdlpuopuiu = cArr;
                this.f25111yggfygwlhe = null;
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f25112zdlpuopuiu.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i13, int i14) {
                return new String(this.f25112zdlpuopuiu, i13, i14 - i13);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f25111yggfygwlhe == null) {
                    this.f25111yggfygwlhe = new String(this.f25112zdlpuopuiu);
                }
                return this.f25111yggfygwlhe;
            }
        }

        zoijcleaow(Appendable appendable) {
            this.f25110zdlpuopuiu = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i13, int i14) throws IOException {
            this.f25109yggfygwlhe.iobyxmoadg(cArr);
            this.f25110zdlpuopuiu.append(this.f25109yggfygwlhe, i13, i14 + i13);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f25110zdlpuopuiu.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i13) throws IOException {
            this.f25110zdlpuopuiu.append((char) i13);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i13, int i14) throws IOException {
            this.f25110zdlpuopuiu.append(charSequence, i13, i14);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i13, int i14) throws IOException {
            Objects.requireNonNull(str);
            this.f25110zdlpuopuiu.append(str, i13, i14 + i13);
        }
    }
}
