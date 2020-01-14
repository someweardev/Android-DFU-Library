package no.nordicsemi.android.dfu;

import android.support.annotation.IntDef;

@SuppressWarnings("WeakerAccess")
@IntDef(value = {
            DfuBaseService.TYPE_SOFT_DEVICE,
            DfuBaseService.TYPE_BOOTLOADER,
            DfuBaseService.TYPE_APPLICATION
        },
        flag = true)
public @interface FileType {}

