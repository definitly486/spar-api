package ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final String iobyxmoadg(InputError inputError, String emptyValueMessage, String wrongFormatMessage) {
        zdlpuopuiu.btonecajqb(inputError, "<this>");
        zdlpuopuiu.btonecajqb(emptyValueMessage, "emptyValueMessage");
        zdlpuopuiu.btonecajqb(wrongFormatMessage, "wrongFormatMessage");
        if (inputError instanceof InputError.BackendError) {
            return ((InputError.BackendError) inputError).getErrorMessage();
        }
        if (zdlpuopuiu.eablkybsjg(inputError, InputError.InvalidValue.Empty.f95347yggfygwlhe)) {
            return emptyValueMessage;
        }
        if (zdlpuopuiu.eablkybsjg(inputError, InputError.InvalidValue.WrongFormat.f95348yggfygwlhe)) {
            return wrongFormatMessage;
        }
        throw new NoWhenBranchMatchedException();
    }
}
