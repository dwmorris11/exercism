def reverse(text):
    result = []
    for c in text:
        result.append(c)
    result.reverse()
    return ''.join(result)

