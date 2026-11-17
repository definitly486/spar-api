package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow implements com.google.gson.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final zoijcleaow f25214cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final zoijcleaow f25215esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final zoijcleaow f25216iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final zoijcleaow f25217jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final zoijcleaow f25218lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ zoijcleaow[] f25219pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final zoijcleaow f25220yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final zoijcleaow f25221zdlpuopuiu;

    final enum iobyxmoadg extends zoijcleaow {
        iobyxmoadg(String str, int i13) {
            super(str, i13, null);
        }

        @Override // com.google.gson.ppxfxbqfkf
        public String iobyxmoadg(Field field) {
            return field.getName();
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg("IDENTITY", 0);
        f25221zdlpuopuiu = iobyxmoadgVar;
        zoijcleaow zoijcleaowVar = new zoijcleaow("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.zoijcleaow.zoijcleaow
            {
                iobyxmoadg iobyxmoadgVar2 = null;
            }

            @Override // com.google.gson.ppxfxbqfkf
            public String iobyxmoadg(Field field) {
                return zoijcleaow.lqeggnwhkg(field.getName());
            }
        };
        f25220yggfygwlhe = zoijcleaowVar;
        zoijcleaow zoijcleaowVar2 = new zoijcleaow("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.zoijcleaow.ppxfxbqfkf
            {
                iobyxmoadg iobyxmoadgVar2 = null;
            }

            @Override // com.google.gson.ppxfxbqfkf
            public String iobyxmoadg(Field field) {
                return zoijcleaow.lqeggnwhkg(zoijcleaow.wkgbmnqykc(field.getName(), ' '));
            }
        };
        f25217jyumaefscl = zoijcleaowVar2;
        zoijcleaow zoijcleaowVar3 = new zoijcleaow("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.zoijcleaow.wkgbmnqykc
            {
                iobyxmoadg iobyxmoadgVar2 = null;
            }

            @Override // com.google.gson.ppxfxbqfkf
            public String iobyxmoadg(Field field) {
                return zoijcleaow.wkgbmnqykc(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f25216iwizpuwonk = zoijcleaowVar3;
        zoijcleaow zoijcleaowVar4 = new zoijcleaow("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.zoijcleaow.eablkybsjg
            {
                iobyxmoadg iobyxmoadgVar2 = null;
            }

            @Override // com.google.gson.ppxfxbqfkf
            public String iobyxmoadg(Field field) {
                return zoijcleaow.wkgbmnqykc(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f25214cqumvgiudr = zoijcleaowVar4;
        zoijcleaow zoijcleaowVar5 = new zoijcleaow("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.zoijcleaow.gxszxtbevo
            {
                iobyxmoadg iobyxmoadgVar2 = null;
            }

            @Override // com.google.gson.ppxfxbqfkf
            public String iobyxmoadg(Field field) {
                return zoijcleaow.wkgbmnqykc(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f25215esjtqupxsv = zoijcleaowVar5;
        zoijcleaow zoijcleaowVar6 = new zoijcleaow("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.zoijcleaow.lqeggnwhkg
            {
                iobyxmoadg iobyxmoadgVar2 = null;
            }

            @Override // com.google.gson.ppxfxbqfkf
            public String iobyxmoadg(Field field) {
                return zoijcleaow.wkgbmnqykc(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        f25218lereixgezr = zoijcleaowVar6;
        f25219pmvmpeiblj = new zoijcleaow[]{iobyxmoadgVar, zoijcleaowVar, zoijcleaowVar2, zoijcleaowVar3, zoijcleaowVar4, zoijcleaowVar5, zoijcleaowVar6};
    }

    private zoijcleaow(String str, int i13) {
        super(str, i13);
    }

    static String lqeggnwhkg(String str) {
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i13 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i13) + upperCase + str.substring(i13 + 1);
            }
        }
        return str;
    }

    public static zoijcleaow valueOf(String str) {
        return (zoijcleaow) Enum.valueOf(zoijcleaow.class, str);
    }

    public static zoijcleaow[] values() {
        return (zoijcleaow[]) f25219pmvmpeiblj.clone();
    }

    static String wkgbmnqykc(String str, char c13) {
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (Character.isUpperCase(cCharAt) && sb3.length() != 0) {
                sb3.append(c13);
            }
            sb3.append(cCharAt);
        }
        return sb3.toString();
    }

    /* synthetic */ zoijcleaow(String str, int i13, iobyxmoadg iobyxmoadgVar) {
        this(str, i13);
    }
}
