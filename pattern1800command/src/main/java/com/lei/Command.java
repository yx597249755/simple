package com.lei;

/**
 * Invoker是调用者（司令员），Receiver是被调用者（士兵），MyCommand是命令，实现了Command接口，持有接收对象，看实现
 *
 */
public interface Command {
    void exe();
}
