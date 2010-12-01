/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dalvik.bytecode;

/**
 * Information about Dalvik opcodes.
 */
public final class OpcodeInfo {
    /**
     * The maximum possible value of a Dalvik opcode.
     *
     * <p><b>Note:</b>: This is constant in any given VM incarnation,
     * but it is subject to change over time, so it is not appropriate
     * to represent as a compile-time constant value.</p>
     */
    public static final int MAXIMUM_VALUE;

    static {
        /*
         * See note on the definition of MAXIMUM_VALUE, above, for
         * why it's not assigned directly on the declaration line.
         *
         * IMPORTANT NOTE: This assignment is generated automatically
         * by the opcode-gen tool. Any edits will get wiped out the
         * next time the tool is run.
         */
        // BEGIN(libcore-maximum-value); GENERATED AUTOMATICALLY BY opcode-gen
        MAXIMUM_VALUE = 255;
        // END(libcore-maximum-value)
    }

    /**
     * This class is not instantiable.
     */
    private OpcodeInfo() {
        // This space intentionally left blank.
    }

    /**
     * Returns whether the given opcode represents a method invocation
     * operation. This includes most things that look like method
     * invocation at the source level, but it notably excludes methods
     * that are implemented directly in the VM as well as ones the VM
     * knows to have empty implementations.
     *
     * @hide Unclear if this is useful enough to publish as supported API.
     *
     * @param opcode one of the values defined in {@link Opcodes}
     */
    public static native boolean isInvoke(int opcode);
}
