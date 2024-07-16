from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/add', methods=['GET'])
def add():
    # Extract numbers from the query parameters
    num1 = request.args.get('num1', type=float)
    num2 = request.args.get('num2', type=float)

    # Validate input
    if num1 is None or num2 is None:
        return jsonify({'error': 'Missing number(s). Please provide two numbers.'}), 400

    # Calculate sum
    result = num1 + num2
    return jsonify({'sum': result})

if __name__ == '__main__':
    app.run(debug=True)


