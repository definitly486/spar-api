package com.google.gson;

import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ojitshcjhn implements rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final /* synthetic */ ojitshcjhn[] f25186cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final ojitshcjhn f25187iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final ojitshcjhn f25188jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final ojitshcjhn f25189yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final ojitshcjhn f25190zdlpuopuiu;

    final enum iobyxmoadg extends ojitshcjhn {
        iobyxmoadg(String str, int i13) {
            super(str, i13, null);
        }

        @Override // com.google.gson.rgvfuqvkyq
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public Double iobyxmoadg(ce.iobyxmoadg iobyxmoadgVar) {
            return Double.valueOf(iobyxmoadgVar.lereixgezr());
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg("DOUBLE", 0);
        f25190zdlpuopuiu = iobyxmoadgVar;
        ojitshcjhn ojitshcjhnVar = new ojitshcjhn("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.ojitshcjhn.zoijcleaow
            {
                iobyxmoadg iobyxmoadgVar2 = null;
            }

            @Override // com.google.gson.rgvfuqvkyq
            public Number iobyxmoadg(ce.iobyxmoadg iobyxmoadgVar2) {
                return new com.google.gson.internal.gxszxtbevo(iobyxmoadgVar2.dsvhmnatus());
            }
        };
        f25189yggfygwlhe = ojitshcjhnVar;
        ojitshcjhn ojitshcjhnVar2 = new ojitshcjhn("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.ojitshcjhn.ppxfxbqfkf
            {
                iobyxmoadg iobyxmoadgVar2 = null;
            }

            @Override // com.google.gson.rgvfuqvkyq
            public Number iobyxmoadg(ce.iobyxmoadg iobyxmoadgVar2) throws IOException {
                String strDsvhmnatus = iobyxmoadgVar2.dsvhmnatus();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strDsvhmnatus));
                    } catch (NumberFormatException unused) {
                        Double dValueOf = Double.valueOf(strDsvhmnatus);
                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                            if (!iobyxmoadgVar2.kcexrzcfyt()) {
                                throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + iobyxmoadgVar2.rgvfuqvkyq());
                            }
                        }
                        return dValueOf;
                    }
                } catch (NumberFormatException e13) {
                    throw new JsonParseException("Cannot parse " + strDsvhmnatus + "; at path " + iobyxmoadgVar2.rgvfuqvkyq(), e13);
                }
            }
        };
        f25188jyumaefscl = ojitshcjhnVar2;
        ojitshcjhn ojitshcjhnVar3 = new ojitshcjhn("BIG_DECIMAL", 3) { // from class: com.google.gson.ojitshcjhn.wkgbmnqykc
            {
                iobyxmoadg iobyxmoadgVar2 = null;
            }

            @Override // com.google.gson.rgvfuqvkyq
            /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
            public BigDecimal iobyxmoadg(ce.iobyxmoadg iobyxmoadgVar2) throws IOException {
                String strDsvhmnatus = iobyxmoadgVar2.dsvhmnatus();
                try {
                    return new BigDecimal(strDsvhmnatus);
                } catch (NumberFormatException e13) {
                    throw new JsonParseException("Cannot parse " + strDsvhmnatus + "; at path " + iobyxmoadgVar2.rgvfuqvkyq(), e13);
                }
            }
        };
        f25187iwizpuwonk = ojitshcjhnVar3;
        f25186cqumvgiudr = new ojitshcjhn[]{iobyxmoadgVar, ojitshcjhnVar, ojitshcjhnVar2, ojitshcjhnVar3};
    }

    private ojitshcjhn(String str, int i13) {
        super(str, i13);
    }

    public static ojitshcjhn valueOf(String str) {
        return (ojitshcjhn) Enum.valueOf(ojitshcjhn.class, str);
    }

    public static ojitshcjhn[] values() {
        return (ojitshcjhn[]) f25186cqumvgiudr.clone();
    }

    /* synthetic */ ojitshcjhn(String str, int i13, iobyxmoadg iobyxmoadgVar) {
        this(str, i13);
    }
}
