import os

folder = r"src/com/mg/bas"
package_line = "package com.mg.bas;\n"

for filename in os.listdir(folder):
    if filename.endswith(".java"):
        filepath = os.path.join(folder, filename)
        with open(filepath, "r", encoding="utf-8") as f:
            content = f.readlines()
        if any(line.strip().startswith("package ") for line in content):
            continue
        with open(filepath, "w", encoding="utf-8") as f:
            f.write(package_line)
            f.writelines(content)
print("Đã thêm package vào tất cả file .java trong", folder)